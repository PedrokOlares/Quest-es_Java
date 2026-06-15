package package_11;

public class Livraria {

    public static void main(String[] args) {
        Livro[] livros = new Livro[] {
            new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true),
            new Livro("1984", "George Orwell", 1949, false),
            new Livro("A Guerra dos Tronos", "George R.R. Martin", 1996, true),
            new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, true)
        };
        System.out.println("-------------Listagem dos livros----------------");
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAno());
            System.out.println("Disponível: " + (livro.getdisponivel() ? "Sim" : "Não"));
            System.out.println("------------------------------------------------");
        }
    }
    
}
