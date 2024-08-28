public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;


    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 1;
    }


    public void abrir() {
        paginaAtual = 1;
        System.out.println("Você abriu o livro '" + titulo + "' na página " + paginaAtual + ".");
    }

    public void lerPagina() {
        if (paginaAtual <= numeroDePaginas) {
            System.out.println("Lendo a página " + paginaAtual + " de '" + titulo + "'.");
            paginaAtual++; // Avança para a próxima página
        } else {
            System.out.println("Você já terminou de ler o livro '" + titulo + "'.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }
}
