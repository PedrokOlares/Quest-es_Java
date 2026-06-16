package package_12;

import java.util.ArrayList;

public class Pedido {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 29.99);
        Produto produto2 = new Produto("Calça Jeans", 79.99);
        Produto produto3 = new Produto("Tênis", 149.99);

        Pedido pedido = new Pedido(12345);
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        pedido.mostrarPedido();
        pedido.calcularValorTotal();
    }

    private int numeroPedido;
    private ArrayList<Produto> produtos;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.produtos = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public void calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }
        System.out.println("O valor total do pedido é: " + valorTotal);

    }

    public void mostrarPedido() {
        System.out.println("Pedido: " + numeroPedido);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " - R$" + produto.getPreco());
        }

    }

}
