public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 5500.00, 10);

        produto1.aumentarEstoque(9);

        produto1.diminuirEstoque(7);

        produto1.diminuirEstoque(25);
    }
}
