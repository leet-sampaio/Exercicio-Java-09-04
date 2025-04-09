import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);

    int i;
    Livro[] livros = new Livro[100];


    void cadastraLivro(Livro[] livros, int contador){

        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Ano: ");
        int ano = Integer.parseInt(sc.nextLine());

        livros[contador] = new Livro(titulo, autor, ano);
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println("--------------");
    }
}
