import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 5;
        int opcao = 0;

        //inicia classe atendente
        Atendente atendente = new Atendente();

        //inicia classe para cadastro
        Cadastro cadastro = new Cadastro();

        //inicia a classe e cria 5 objetos
        Livro[] livros = new Livro[100];
        livros[0] = new Livro("O Animal Social", "Elliot Aronson", 2019);
        livros[1] = new Livro("Vento Geral", "Thiago de Mello", 1981);
        livros[2] = new Livro("A Queda do Céu", "David Kopenawa", 2010);
        livros[3] = new Livro("Capital e Ideologia", "Thomas Piketty", 2019);
        livros[4] = new Livro("O Livro Tibetano Dos Mortos", "Thpten Jinpa", 2024);

        while(true){
            atendente.opcoes();
            opcao = Integer.parseInt(sc.nextLine());

            if(opcao == 1){
                cadastro.cadastraLivro(livros, contador);
                contador++;
            } else if(opcao == 2){
                for (int i = 0; i < contador; i++) {
                    livros[i].exibirLivro();
                    System.out.println("--------------");
                }
            } else if(opcao == 3){
                System.out.println("Você não é mais que um pensamento, Adeus.");
                break;
            } else{
                System.out.println("Opção inválida.");
            }
        }
    }
}