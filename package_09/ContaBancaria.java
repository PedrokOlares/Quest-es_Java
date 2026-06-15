package package_09;

public class ContaBancaria {
    
private String titular;
private int numeroConta;
private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
     this.titular = titular;
     this.numeroConta = numeroConta;
     this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;

    }
   
    public void depositar(double valor){
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");
            return;
        }
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return false;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }

    public boolean transferir(ContaBancaria destino, double valor){
        if (this.sacar(valor)) { // Tenta sacar da conta de origem (this)
            destino.depositar(valor); // Se o saque for bem-sucedido, deposita na conta de destino
            return true;
        }
        return false; // A transferência falhou (saldo insuficiente)
    }
}
