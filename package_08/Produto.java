package package_08;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public int adicionarEstoque(int qtd) {
        this.quantidade += qtd;
        return this.quantidade;
    }
    //metodo para calcular o valor total em estoque
    public double valorTotalEstoque(){
        return this.preco * this.quantidade;
    }

    public int removerEstoque(int qtd) {
        if (this.quantidade >= qtd) {
            this.quantidade -= qtd;
        }else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
        return this.quantidade;
    }
}
