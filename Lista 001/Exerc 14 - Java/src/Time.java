public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;
    private int maxJogadores;

    public Time(String nome, String tecnico, int maxJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.maxJogadores = maxJogadores;
        this.numeroDeJogadores = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public void adicionarJogador() {
        if (numeroDeJogadores < maxJogadores) {
            numeroDeJogadores++;
            System.out.println("Jogador adicionado. Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Não é possível adicionar mais jogadores. Limite atingido.");
        }
    }

    public void removerJogador() {
        if (numeroDeJogadores > 0) {
            numeroDeJogadores--;
            System.out.println("Jogador removido. Total de jogadores: " + numeroDeJogadores);
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Time: " + nome);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Número de jogadores: " + numeroDeJogadores + "/" + maxJogadores);
    }
}
