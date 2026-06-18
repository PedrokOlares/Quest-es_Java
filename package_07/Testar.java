package package_07;

public class Testar {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new Funcionario("João", 2000, "Gerente"),
            new Funcionario("Maria", 3000, "Programador"),
            new Funcionario("Pedro", 2500, "Desenvolvedor")
        };

        for (Funcionario f : funcionarios) {
            System.out.println("--- Dados Iniciais ---");
            f.mostrarDados();

            if ("Programador".equals(f.getCargo())){
                System.out.println("\nAplicando aumento de 10% para Programador...");
                f.aumentarSalario(10);
                System.out.println("\n--- Dados Após Aumento ---");
                f.mostrarDados();
            }
            System.out.println("--------------------------\n");
        }
    }
}
