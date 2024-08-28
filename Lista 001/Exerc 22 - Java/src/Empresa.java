public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;

    public Empresa(String nome, String cnpj, int numeroFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void contratarFuncionario() {
        numeroFuncionarios++;
        System.out.println("Um funcionário foi contratado. Total de funcionários: " + numeroFuncionarios);
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Total de funcionários: " + numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Número de Funcionários: " + numeroFuncionarios);
    }
}
