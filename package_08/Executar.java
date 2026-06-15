package package_08;

public class Executar {
    public static void main(String[]args){
    int num = 0;
    Produto[] produtos = {
        new Produto("Notebook", 3500.00, 10),
        new Produto("Smartphone", 1500.00, 20),
        new Produto("Tablet", 2000.00, 15)};
        
        for (Produto produto : produtos) {
            // Relatório de produtos
            System.out.println("-------Relatório-de-Produtos-"+num+"-------");
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidade());
            System.out.println("Quantidade em estoque após remoção: " + produto.removerEstoque(5));
            System.out.println("Quantidade em estoque após adição: " + produto.adicionarEstoque(5));
            produto.valorTotalEstoque();
            System.out.println();
            num++;
        }
    }
    
}
