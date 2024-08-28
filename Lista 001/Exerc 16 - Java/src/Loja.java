public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private boolean aberta;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.aberta = false;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void abrirLoja() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja '" + nome + "' está agora aberta.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    public void fecharLoja() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja '" + nome + "' foi fechada.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
