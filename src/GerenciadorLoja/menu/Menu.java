package GerenciadorLoja.menu;

import GerenciadorLoja.repositorios.MemoriaProdutoRepository;
import GerenciadorLoja.produtos.Produto;
import GerenciadorLoja.produtos.ProdutoFisico;
import GerenciadorLoja.repositorios.ProdutoRepository;
import GerenciadorLoja.service.ProdutoService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
     ProdutoRepository repository = new MemoriaProdutoRepository();
        ProdutoService service = new ProdutoService(repository);
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Bem-Vindo ao gerenciador de estoque!");

        while (opcao != 4){
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Produto Físico");
            System.out.println("2 - Listar Todos os Produtos");
            System.out.println("3 - Realizar Venda (Baixa no Estoque)");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            try {
                switch  (opcao) {
                    case 1:
                        System.out.println("Digite o id do produto (Ex: 001 ): ");
                        String id = sc.nextLine();

                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite a categoria do produto: ");
                        String categoria = sc.nextLine();

                        System.out.println("Digite a quantidade inicial do produto: ");
                        int quantidade = sc.nextInt();

                        System.out.println("Digite o valor do produto: ");
                        double  preco = sc.nextDouble();

                        Produto produto = new ProdutoFisico(id,  nome, categoria, quantidade, preco);
                        service.cadastrarProduto(produto);
                        break;

                    case 2:
                        System.out.println("\n--- Produtos em Estoque ---");
                        List<Produto> lista = service.buscarTodos();
                        if (lista.isEmpty()){
                            System.out.println("Nenhum produto cadastrado ainda.");
                        } else {
                            for (Produto p : lista) {
                                System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome() +  " | qtd: " + p.getQuantidade() + " | Preço: R$" + p.getPreco());
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Funcionalidade em desenvolvimento...");
                        break;

                    case 4:
                        System.out.println("Encerrando o sistema. Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.err.println("Erro: " +  e.getMessage());
            }
        }
    }
}
