package GerenciadorLoja.service;

import GerenciadorLoja.produtos.Produto;
import GerenciadorLoja.repositorios.ProdutoRepository;

import java.util.List;
import java.util.Optional;

public class ProdutoService {
    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarProduto(Produto produto){
        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero!");
        }
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
        throw new IllegalArgumentException("O nome do produto é obrigatório!");
        }
        repository.salvar(produto);
        System.out.println("Produto cadastrado com sucesso!" + produto.getNome());
    }

    public void realizarVenda(String id, int quantidade){
        Optional<Produto> produtoOpt = repository.buscarPorId(id);

        if (produtoOpt.isPresent()){
            Produto p =  produtoOpt.get();
            p.retirarEstoque(quantidade);
            repository.atualizar(p);
        System.out.println("Venda realizada com sucesso! Novo estoque de " + p.getNome() + ": " + p.getQuantidade());
        } else {
            System.out.println("Erro: produto nao encontrado!");
        }
    }
    public List<Produto> buscarTodos(){
        return repository.buscarTodos();
    }
}
