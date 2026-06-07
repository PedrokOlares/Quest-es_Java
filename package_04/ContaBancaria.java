package package_04;

public class ContaBancaria {
    private int Saldo;
    private String titular;

    public ContaBancaria(int saldo, String titular) {
        this.Saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int SaldoCliente(int Saldo, int valor_depositado) {
        this.Saldo = valor_depositado;
        if (this.Saldo < 0) {
            System.out.println("valor menor que 0 pai");
        } else
            ;
        return this.Saldo;

    }

}
