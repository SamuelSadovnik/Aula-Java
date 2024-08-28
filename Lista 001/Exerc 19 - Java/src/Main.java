public class Main {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Diario de Um Banana", "XXX", 2.5);

        livro.exibirInformacoes();

        livro.abrirLivro();
        livro.fecharLivro();
        livro.fecharLivro();
    }
}
