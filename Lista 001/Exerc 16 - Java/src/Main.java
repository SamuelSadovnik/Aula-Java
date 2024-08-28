public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Havan", "Av. Brasil", "(45) 1234-5678");

        loja.exibirInformacoes();

        loja.abrirLoja();
        loja.fecharLoja();
        loja.fecharLoja();
    }
}
