public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Biopark", "12.345.678/0001-99", 80);

        empresa.exibirInformacoes();

        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
    }
}
