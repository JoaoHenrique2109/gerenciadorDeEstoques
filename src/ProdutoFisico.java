public class ProdutoFisico extends Produto{
    public ProdutoFisico(String id, String nome, String categoria, int quantidade, double preco) {
        this.setId(id);
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }
}
