package package_09;

public class Contas {
    public static void main(String[] args) {
        ContaBancaria[] contas =  {
            new ContaBancaria("João Silva", 12345, 1000.00),
            new ContaBancaria("Maria Oliveira", 67890, 1000.00),
            new ContaBancaria("Carlos Pereira", 54321, 1000.00)
        };

        // --- Imprime o estado inicial das contas ---
        System.out.println("------- Saldo Inicial das Contas -------");
        imprimirRelatorio(contas);

        // --- Executa uma sequência lógica de transações ---
        System.out.println("\n------- Realizando Transações -------");
        ContaBancaria contaJoao = contas[0];
        ContaBancaria contaMaria = contas[1];
        ContaBancaria contaCarlos = contas[2];

        System.out.println("1. João deposita R$ 500.");
        contaJoao.depositar(500);

        System.out.println("2. Maria saca R$ 100.");
        contaMaria.sacar(100);

        System.out.println("3. Carlos transfere R$ 300 para João.");
        contaCarlos.transferir(contaJoao, 300);

        System.out.println("4. João tenta transferir R$ 2000 para Maria (saldo insuficiente).");
        contaJoao.transferir(contaMaria, 2000);
        // --- Imprime o estado final das contas ---
        System.out.println("\n------- Saldo Final das Contas -------");
        imprimirRelatorio(contas);
    }

    public static void imprimirRelatorio(ContaBancaria[] contasArray) {
        for (ContaBancaria conta : contasArray) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Número da Conta: " + conta.getNumeroConta());
            System.out.printf("Saldo: R$ %.2f\n", conta.getSaldo());
            System.out.println("------------------------------------");
        }
    }
    
}
