package GerenciadorLoja.persons;

public class Cliente extends Pessoa {
    private double limiteCredito;
    private int quantidadeDeCommpras;
    private boolean clienteAtivo;

    public Cliente(String nome, String cpf, String email, String telefone, String endereco, String senha,
                   double limiteCredito) {
        super (nome, cpf, email, senha, telefone, endereco);

        this.limiteCredito = limiteCredito;

        this.quantidadeDeCommpras = 0;
        this.clienteAtivo = true;
    }
    public double getLimiteCredito() {return  limiteCredito;}
    public void setLimiteCredito(double limiteCredito) {this.limiteCredito = limiteCredito;}

    public int getQuantidadeDeCommpras() {return quantidadeDeCommpras;}
    public void setQuantidadeDeCommpras(int quantidadeDeCommpras) {this.quantidadeDeCommpras = quantidadeDeCommpras;}

    public boolean isClienteAtivo() {return clienteAtivo;}
    public void setClienteAtivo(boolean clienteAtivo) {this.clienteAtivo = clienteAtivo;}

    public void registrarCompra() {
        this.quantidadeDeCommpras++;
    }
}

