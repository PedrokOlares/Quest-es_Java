package package_03;

public class Acesso {
    public static void main(String[] args) {
        Nubank acesso01 = new Nubank("Pedro", 755, 18, 50000);
        System.out.println("|------Eyes---of---God------|");
        System.out.println("Nome: " + acesso01.getNome());
        System.out.println("CPF da lenda: " + acesso01.getCpf());
        System.out.println("idade do novinho: " + acesso01.getIdade());

        acesso01.receberPremio(200);
        System.out.println("Saldo da lenda: " + acesso01.getSaldo());
    }
}
