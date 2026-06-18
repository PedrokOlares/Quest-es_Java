package package_10;

public class Executar {
    public static void main(String[] args) {
        int cont = 0;
        int contperdeu = 0;
        Aluno[] alunos = new Aluno[] {
            new Aluno("João", 12345, new double[]{7.5, 8.0, 6.0}),
            new Aluno("Pedro", 42645, new double[]{7.5, 5.0, 8.0}),
            new Aluno("Maria", 78912, new double[]{5.0, 4.5, 6.0}),
            new Aluno("Ana", 34567, new double[]{9.0, 8.5, 7.0})
        };
        System.out.println("-------------Listagem dos alunos----------------");
        for (Aluno aluno : alunos) {
            
            if (aluno.aprovado()) {
                System.out.println("-------------alunos aprovados-------------------");
                System.out.println("Aluno aprovado: " + aluno.getNome());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Média: " + aluno.calcularMedia());
                cont++; // Pula para a próxima iteração do loop
            } else {
                System.out.println("-------------alunos perdedores lixos------------");
                System.out.println("Aluno reprovado: " + aluno.getNome());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Média: " + aluno.calcularMedia());
                contperdeu++;
            }
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Média: " + aluno.calcularMedia());
            System.out.println("Aprovado: " + (aluno.aprovado() ? "Sim" : "Não"));
            System.out.println("------------------------------------------------");
        }
        System.out.println("Total de alunos aprovados: " + cont);
        System.out.println("Total de alunos reprovados: " + contperdeu);
    }
}
