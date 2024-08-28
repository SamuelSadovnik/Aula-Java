public class Main {
    public static void main(String[] args) {
        Time time = new Time("Corinthians", "Tite", 23);

        time.exibirInformacoes();

        time.adicionarJogador();
        time.adicionarJogador();
        time.removerJogador();
        time.exibirInformacoes();
    }
}
