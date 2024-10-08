public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque diminuído em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Não há estoque suficiente para remover " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para diminuir o estoque.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
