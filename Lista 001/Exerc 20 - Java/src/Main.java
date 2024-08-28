public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Speed", "BMX", 22);

        bicicleta.exibirInformacoes();

        bicicleta.pedalar();
        bicicleta.frear();
        bicicleta.frear();
    }
}
