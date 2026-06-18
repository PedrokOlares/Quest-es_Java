package package_06;

public class Testar {
    public static void main(String[] args) {

        Contrato Dev_01 = new Contrato("Pedro", 80, 8, "Finalizado");

        System.out.println("Desenvolvedor: " + Dev_01.getDesenvolvedor());
        System.out.println("Status do Desenvolvedor: " + Dev_01.getStatus());
        System.out.println("Pagamento Líquido: " + Dev_01.CalcularPagamentoLiquido(10));
    }
}
