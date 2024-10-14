package tech.livros;



// Classe Livro
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado; // Indica se o livro está emprestado

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false; // Inicialmente, o livro não está emprestado
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    // Método para exibir informações do livro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
        System.out.println("------------------------------");
    }

    // Métodos para gerenciar o estado de empréstimo
    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }
}