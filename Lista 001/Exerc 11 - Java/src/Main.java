public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Cascavel", 400000, "Parana");

        cidade.exibirInformacoes();

        cidade.aumentarPopulacao(120000);
        System.out.println("População após aumento: " + cidade.getPopulacao());

        cidade.diminuirPopulacao(5500);
        System.out.println("População após diminuição: " + cidade.getPopulacao());
    }
}
