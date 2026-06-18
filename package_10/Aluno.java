package package_10;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    // Getters 
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public boolean aprovado(){
        
        return calcularMedia() >= 6.0;
    }


  
}
