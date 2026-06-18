package package_06;

public class Contrato {
    // Var privadas 🚽
    private String desenvolvedor;
    private double valorHora;
    private int horasTrabalhadas;
    private String status;

    public Contrato(String desenvolvedor, double valorHora, int horasTrabalhadas, String status) {
        this.desenvolvedor = desenvolvedor;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.status = "ATIVO";
    }

    // geters
    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public String getStatus() {
        return status;
    }

    public double CalcularPagamentoLiquido(double impostoRetido) {

        if (this.status.equalsIgnoreCase("FINALIZADO") || this.status.equalsIgnoreCase("Finalizado")) {
            return 0.0;
        }

        double Calculo_base = this.horasTrabalhadas * this.valorHora;
        impostoRetido += Calculo_base + impostoRetido;

        if (this.horasTrabalhadas > 160) {
            Calculo_base = Calculo_base + (Calculo_base * 15 / 100);
        }
        double valorimposto = Calculo_base * (impostoRetido / 100);
        double valorliquido = (Calculo_base - valorimposto);

        if (valorliquido < 0) {
            valorliquido = valorliquido * (-1);
        }
        return valorliquido;

    }
}
