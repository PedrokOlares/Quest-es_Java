package package_11;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + this.titulo + "' não está disponível para empréstimo.");
        }
    }
    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        } else {
        System.out.println("O livro '" + this.titulo + "' já estava disponível.");
        }
    }
}   
