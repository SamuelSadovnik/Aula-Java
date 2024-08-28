public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private boolean emExecucao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.emExecucao = false; // O filme começa parado
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void iniciarFilme() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("O filme '" + titulo + "' está agora em execução.");
        } else {
            System.out.println("O filme já está em execução.");
        }
    }

    public void pararFilme() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("O filme '" + titulo + "' foi parado.");
        } else {
            System.out.println("O filme não está em execução.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
    }
}
