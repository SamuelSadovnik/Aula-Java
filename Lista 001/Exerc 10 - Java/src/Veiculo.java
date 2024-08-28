public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;
    private double nivelCombustivel;

    public Veiculo(String tipo, String placa, String cor, double nivelCombustivel) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.nivelCombustivel = nivelCombustivel;
    }

    public void abastecer(double litros) {
        if (litros > 0) {
            nivelCombustivel += litros;
            System.out.println("O veículo foi abastecido com " + litros + " litros. Nível atual de combustível: " + nivelCombustivel + " litros.");
        } else {
            System.out.println("Quantidade inválida para abastecimento.");
        }
    }

    public void lavar() {
        System.out.println("O " + tipo + " de cor " + cor + " com placa " + placa + " foi lavado.");
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }
}
