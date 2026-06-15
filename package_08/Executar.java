package package_08;
public class Executar {
    public static void main(String[]args){
   
    Produto[] produtos = {
        new Produto("Notebook", 3500.00, 10),
        new Produto("Smartphone", 1500.00, 20),
        new Produto("Tablet", 2000.00, 15)};
        
        System.out.println("------- Relatório de Produtos -------");
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidade());
            System.out.printf("Valor total em estoque: R$ %.2f\n", produto.valorTotalEstoque());
            System.out.println("------------------------------------");
        }
        // --- Lógica para encontrar maior e menor estoque ---
        // (Esta lógica deve ser feita fora do loop de relatório para evitar saídas repetidas)
        if (produtos.length > 0) {
            Produto produtoMaiorEstoque = produtos[0];
            Produto produtoMenorEstoque = produtos[0];

            for (int i = 1; i < produtos.length; i++) {
                if (produtos[i].getQuantidade() > produtoMaiorEstoque.getQuantidade()) {
                    produtoMaiorEstoque = produtos[i];
                }
                if (produtos[i].getQuantidade() < produtoMenorEstoque.getQuantidade()) {
                    produtoMenorEstoque = produtos[i];
                }
            }
            System.out.println("\n--- Análise de Estoque ---");
            System.out.println("Produto com MAIOR estoque: " + produtoMaiorEstoque.getNome() + " (" + produtoMaiorEstoque.getQuantidade() + " unidades)");
            System.out.println("Produto com MENOR estoque: " + produtoMenorEstoque.getNome() + " (" + produtoMenorEstoque.getQuantidade() + " unidades)");
        }
        // --- Exemplo de atualização de estoque ---
        System.out.println("\n--- Exemplo de Atualização (Notebook) ---");
        Produto notebook = produtos[0];
        System.out.println("Estoque inicial: " + notebook.getQuantidade());
        notebook.removerEstoque(5);
        System.out.println("Estoque após remover 5: " + notebook.getQuantidade());
        notebook.adicionarEstoque(2);
        System.out.println("Estoque após adicionar 2: " + notebook.getQuantidade());
        System.out.printf("Novo valor total em estoque para Notebook: R$ %.2f\n", notebook.valorTotalEstoque());
    }
}
