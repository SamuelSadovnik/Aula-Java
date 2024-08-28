public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            this.populacao += quantidade;
        } else {
            System.out.println("A quantidade deve ser positiva.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            this.populacao -= quantidade;
        } else {
            System.out.println("Quantidade inválida para diminuir.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Cidade: " + nome);
        System.out.println("População: " + populacao);
        System.out.println("Estado: " + estado);
    }
}
