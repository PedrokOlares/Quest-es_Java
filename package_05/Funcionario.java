package package_05;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double AplicarAumento(double percentual) {
        this.salario = (this.salario + (this.salario * percentual / 100));

        return this.salario;
    }
}