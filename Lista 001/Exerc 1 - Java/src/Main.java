public class Main {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Quixote", "Miguel de Cervantes", 500);

        meuLivro.abrir();

        meuLivro.lerPagina();
    }
}
