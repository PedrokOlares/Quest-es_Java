package package_04;

public class ContaBancaria {
    private int Saldo;
    private String titular;
    private int valor_depositado;

    public ContaBancaria(int saldo, String titular) {
        this.Saldo = saldo;
        this.titular = titular;
    }

    public int getValor_depositado() {
        return valor_depositado;
    }

    public int getSaldo() {
        return Saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int SaldoCliente(int valor_depositado) {

        if (valor_depositado < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.Saldo += valor_depositado;
        }
        return this.Saldo;
    }

}
