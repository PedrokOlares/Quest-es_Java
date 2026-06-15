package package_11;

public class Livraria {

    public static void main(String[] args) {
        Livro[] livros = new Livro[] {
            new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true), // Disponível
            new Livro("1984", "George Orwell", 1949, true), // Disponível
            new Livro("A Guerra dos Tronos", "George R.R. Martin", 1996, false) // Indisponível
        };

        System.out.println("------------- Status Inicial dos Livros ----------------");
        imprimirStatus(livros);

        System.out.println("\n------------- Tentando Empréstimos ----------------");
        livros[0].emprestar(); // Deve funcionar
        livros[2].emprestar(); // Deve falhar, já está emprestado

        System.out.println("\n------------- Status Após Empréstimos ----------------");
        imprimirStatus(livros);

        System.out.println("\n------------- Tentando Devoluções ----------------");
        livros[0].devolver(); // Deve funcionar
        livros[1].devolver(); // Deve falhar, já estava disponível

        System.out.println("\n------------- Status Final dos Livros ----------------");
        imprimirStatus(livros);
    }

    public static void imprimirStatus(Livro[] biblioteca) {
        for (Livro livro : biblioteca) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Disponível: " + (livro.isDisponivel() ? "Sim" : "Não"));
            System.out.println("------------------------------------------------");
        }
    }
}
