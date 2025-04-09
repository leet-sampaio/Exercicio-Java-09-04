public class Livro {
    String titulo;
    String autor;
    int ano;

    //construtor
    Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //metodo
    void exibirLivro(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano);

    }
}

