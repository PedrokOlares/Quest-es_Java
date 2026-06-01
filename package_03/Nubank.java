package package_03;

public class Nubank {
      private String nome;
      private int cpf;
      private int idade;
      private double saldo;

      public Nubank(String nome, int cpf, int idade, double saldo) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
            this.saldo = saldo;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public int getCpf() {
            return cpf;
      }

      public void setCpf(int cpf) {
            this.cpf = cpf;
      }

      public int getIdade() {
            return idade;
      }

      public void setIdade(int idade) {
            this.idade = idade;
      }

      public double getSaldo() {
            return saldo;
      }

      public double receberPremio(double valor) {
            this.saldo += valor;
            return this.saldo;
      }

      public void setSaldo(double saldo) {
            this.saldo = saldo;
      }
}
