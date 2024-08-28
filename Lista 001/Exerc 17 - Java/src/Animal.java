public class Animal {
    private String especie;
    private int idade;
    private double peso;
    private boolean dormindo;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.dormindo = false;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void alimentar(double quantidadeDeComida) {
        if (quantidadeDeComida > 0) {
            peso += quantidadeDeComida;
            System.out.println("O animal foi alimentado. Novo peso: " + peso + " kg.");
        } else {
            System.out.println("Quantidade de comida inválida.");
        }
    }

    public void dormir() {
        if (!dormindo) {
            dormindo = true;
            System.out.println("O animal está dormindo.");
        } else {
            System.out.println("O animal já está dormindo.");
        }
    }

    public void acordar() {
        if (dormindo) {
            dormindo = false;
            System.out.println("O animal acordou.");
        } else {
            System.out.println("O animal já está acordado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
    }
}
