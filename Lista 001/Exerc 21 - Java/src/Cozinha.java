public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;
    private boolean emUso;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
        this.emUso = false;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void cozinhar() {
        if (!emUso) {
            emUso = true;
            System.out.println("A cozinha está sendo usada para cozinhar.");
        } else {
            System.out.println("A cozinha já está em uso.");
        }
    }

    public void limpar() {
        if (emUso) {
            emUso = false;
            System.out.println("A cozinha foi limpa.");
        } else {
            System.out.println("A cozinha já está limpa.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade de pessoas: " + quantidadePessoas);
        System.out.println("Cor: " + cor);
    }
}
