public class Main {
    public static void main(String[] args) {
        double[] notas = {9.5, 6.0, 9.0, 7.5};

        Aluno aluno1 = new Aluno("Samuel", "2024989", "Analise e Desenvolvimento de Sistemas", notas);

        double media = aluno1.calcularMedia();
        System.out.println("A média de notas de " + aluno1.getNome() + " é: " + media);
    }
}
