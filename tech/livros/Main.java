package tech.livros;

public class Main {
    public static void main(String[] args) {
        // Criação da biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        // Criação de livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criação de um usuário
        Usuario usuario = new Usuario("Carlos");

        // Exibindo os livros da biblioteca
        biblioteca.mostrarLivros();

        // Usuário emprestando um livro
        biblioteca.emprestarLivro(livro1, usuario);
        biblioteca.mostrarLivros();

        // Exibindo livros emprestados pelo usuário
        usuario.mostrarLivrosEmprestados();

        // Devolvendo o livro
        biblioteca.devolverLivro(livro1, usuario);
        biblioteca.mostrarLivros();

        // Removendo um livro
        biblioteca.removerLivro(livro2);
        biblioteca.mostrarLivros();
    }
}