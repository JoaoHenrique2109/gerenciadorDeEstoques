import java.util.*;

public class MemoriaProdutoRepository implements ProdutoRepository {
    private Map<String, Produto> dados = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        dados.put(produto.getId(), produto);
    }

    @Override
    public void atualizar(Produto produto) {
        dados.put(produto.getId(), produto);
    }

    @Override
    public void deletar (String id) {
        dados.remove(id);

    }

    @Override
    public Optional<Produto> buscarPorId(String id) {
        return Optional.ofNullable(dados.get(id));

    }
    @Override
    public List<Produto> buscarTodos() {
        return new ArrayList<>(dados.values());
    }

}
