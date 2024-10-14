package tech.livros;
import java.util.ArrayList;
import java.util.List;

// Classe Biblioteca
class Biblioteca {
    private String nome;
    private List<Livro> livros; // Lista de livros disponíveis

    // Construtor
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para remover um livro
    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado: " + livro.getTitulo());
        }
    }

    // Método para exibir todos os livros
    public void mostrarLivros() {
        System.out.println("Biblioteca: " + nome);
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            livro.mostrarInfo();
        }
    }

    // Método para emprestar um livro
    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && !livro.isEmprestado()) {
            livro.emprestar();
            usuario.adicionarLivroEmprestado(livro);
            System.out.println(usuario.getNome() + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("Livro não disponível para empréstimo: " + livro.getTitulo());
        }
    }

    // Método para devolver um livro
    public void devolverLivro(Livro livro, Usuario usuario) {
        if (livros.contains(livro) && livro.isEmprestado()) {
            livro.devolver();
            usuario.removerLivroEmprestado(livro);
            System.out.println(usuario.getNome() + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("Livro não encontrado ou não está emprestado: " + livro.getTitulo());
        }
    }
}

