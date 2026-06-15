package package_07;
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100.0);
        }
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome + "\nSalário: " + String.format("%.2f", salario) + "\nCargo: " + cargo);
    }
}
