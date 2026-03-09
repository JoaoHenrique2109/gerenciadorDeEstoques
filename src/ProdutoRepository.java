import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    void salvar(Produto produto);
    void atualizar(Produto produto);
    void deletar(String id);
    Optional<Produto> buscarPorId(String id);
    List<Produto> buscarTodos();
}
