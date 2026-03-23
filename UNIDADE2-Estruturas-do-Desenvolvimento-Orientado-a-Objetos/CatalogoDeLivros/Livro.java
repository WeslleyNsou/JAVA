import java.util.ArrayList;
import java.util.List;
import java.util.Array;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }   

    public String ExibirInformacoes() {
        return "Título: " + titulo + "\nAutor: " + autor;
    }
}

class Principal {
    public static void main(String[] args) {
        List<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        biblioteca.add(new Livro("Cristianismo puro e simples", "C.S. Lewis", 1952));
        biblioteca.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        biblioteca.add(new Livro("Inocência", "Visconde de Taunay", 1872));
        biblioteca.add(new Livro("As Viagens de Gulliver", "Jonathan Swift", 1726));

        for (Livro livro : biblioteca) {
           if(livro.ExibirInformacoes().contains("J.R.R. Tolkien") || livro.ExibirInformacoes().contains("C.S. Lewis")) {  
            System.out.println(livro.ExibirInformacoes(livro.titulo, livro.autor));
           }
        }
    }
}