package package_02;

public class Veiculo {
    private String marca;
    private int ano;
    protected int velAtual;

    // Construtor
    public Veiculo(String marca, int ano, int velAtual) {
        this.marca = marca;
        this.ano = ano;
        this.velAtual = velAtual;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    // Método Acelerar: Atualiza o atributo da classe e retorna a nova velocidade
    public int acelerar(int incremento) {
        this.velAtual += incremento;
        return this.velAtual;
    }

    // Método Frear: Atualiza o atributo da classe, garante que não seja menor que
    // zero e retorna
    public int freiar(int decremento) {
        this.velAtual -= decremento;
        if (this.velAtual < 0) {
            this.velAtual = 0;
        }
        return this.velAtual;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Veículo [Marca: ");
        stringBuilder.append(marca);
        stringBuilder.append(", Ano: ");
        stringBuilder.append(ano);
        stringBuilder.append(", Velocidade Atual: ");
        stringBuilder.append(velAtual);
        stringBuilder.append(" km/h]");
        return stringBuilder.toString(); // Adicionado o ponto e vírgula
    }

} // Chave de fechamento da classe que estava faltando
