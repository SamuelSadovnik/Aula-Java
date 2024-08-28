public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda;
    private boolean emMovimento;

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
        this.emMovimento = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void pedalar() {
        if (!emMovimento) {
            emMovimento = true;
            System.out.println("Você começou a pedalar a bicicleta.");
        } else {
            System.out.println("A bicicleta já está em movimento.");
        }
    }

    public void frear() {
        if (emMovimento) {
            emMovimento = false;
            System.out.println("Você freou a bicicleta.");
        } else {
            System.out.println("A bicicleta já está parada.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho da roda: " + tamanhoRoda + " polegadas");
    }
}
