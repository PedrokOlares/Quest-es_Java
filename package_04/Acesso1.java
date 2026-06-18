package package_04;

public class Acesso1 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(1000, "Lucas");

        System.out.println("Saldo antes da adição: " + conta.getSaldo());

        conta.SaldoCliente(600);

        System.out.println("Saldo após a adição: " + conta.getSaldo());

    }
}
