public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro '" + titulo + "' foi aberto.");
        } else {
            System.out.println("O livro já está aberto.");
        }
    }

    public void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro '" + titulo + "' foi fechado.");
        } else {
            System.out.println("O livro já está fechado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}
