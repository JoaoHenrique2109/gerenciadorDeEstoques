package GerenciadorLoja.persons;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private LocalDate dataContratacao;


    public Funcionario(String nome, String cpf, String email, String senha, String telefone, String endereco, double salario, String cargo, LocalDate dataContratacao) {
        super(nome, cpf, email, senha, telefone, endereco);

        this.salario = salario;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;

    }
    public double getSalario() {return salario; }
    public void setSalario(double salario) {this.salario = salario;}

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}

    public LocalDate getDataContratacao() {return dataContratacao;}
    public void setDataContratacao(LocalDate dataContratacao) {this.dataContratacao = dataContratacao;}

}
