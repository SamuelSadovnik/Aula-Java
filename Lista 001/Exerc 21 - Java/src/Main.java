public class Main {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Industrial", 5, "Branca");

        cozinha.exibirInformacoes();

        cozinha.cozinhar();
        cozinha.limpar();
    }
}
