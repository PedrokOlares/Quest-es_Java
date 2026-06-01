package package_02;

public class Carro extends Veiculo {
    public Carro(String marca, int ano, int velAtual) {
        super(marca, ano, velAtual);
        // TODO Auto-generated constructor stub
    }

    private String nome_modelo;

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public String buzinar() {
        StringBuilder stringBuilder = new StringBuilder(); // Letra minúscula no nome da variável
        stringBuilder.append("BEE BEEE BEE");
        return stringBuilder.toString();
    }

    public String Name_model() {
        StringBuilder sc = new StringBuilder();
        sc.append("Nome: ");
        sc.append(nome_modelo);
        sc.append("");
        sc.append(getNome_modelo());
        return sc.toString();

    }

}
