public class Main {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Carro", "192-ABC", "Azul", 8.0);

        meuVeiculo.abastecer(50.0);

        meuVeiculo.lavar();
    }
}
