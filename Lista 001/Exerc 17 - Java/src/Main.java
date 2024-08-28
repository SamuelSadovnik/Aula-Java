public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 13, 10.5);

        animal.exibirInformacoes();

        animal.alimentar(6.0);
        animal.dormir();
        animal.acordar();
    }
}
