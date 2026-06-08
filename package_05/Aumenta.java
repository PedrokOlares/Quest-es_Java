package package_05;

public class Aumenta {

    public static void main(String[] args) {

        Funcionario CLT_01 = new Funcionario("Pedro", 1500);
        System.out.println("O nome do meliante: " + CLT_01.getNome());
        System.err.println("Seu salario sem o aumento de 1500$: " + CLT_01.getSalario());
        System.err.println("Seu salario após o aumento de 18%: " + CLT_01.AplicarAumento(18));

    }

}
