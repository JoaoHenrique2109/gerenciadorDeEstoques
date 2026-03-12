public abstract class Produto {
    private String nome;
    private String id;
    private String categoria;
    private int quantidade;
    private double preco;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {

        this.preco = preco;
    }

    public void retirarEstoque(int qtd) {
        if (qtd > this.quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidade -= qtd;
    }
}
