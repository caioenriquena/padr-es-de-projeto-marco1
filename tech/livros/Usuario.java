package tech.livros;
import java.util.ArrayList;
import java.util.List;

// Classe Usuario
// Classe Usuario
class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados; // Lista de livros emprestados

    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para exibir os livros emprestados
    public void mostrarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Livro livro : livrosEmprestados) {
            livro.mostrarInfo();
        }
    }

    // Métodos para gerenciar empréstimos via Biblioteca
    public void adicionarLivroEmprestado(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}