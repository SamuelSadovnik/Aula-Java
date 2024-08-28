public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria; // Capacidade da bateria em mAh
    private boolean ligado;


    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.ligado = false; // O celular começa desligado
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O celular " + marca + " " + modelo + " foi ligado.");
        } else {
            System.out.println("O celular já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O celular " + marca + " " + modelo + " foi desligado.");
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isLigado() {
        return ligado;
    }
}
