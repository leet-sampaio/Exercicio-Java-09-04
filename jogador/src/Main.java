import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inicializa a classe ArrayList
        ArrayList<Jogador> jogadores = new ArrayList();
        //inicializa classe jogador
        jogadores.add(new Jogador("Kelvin", 1000, 1));
        jogadores.add(new Jogador("Matheus", 2000, 2));
        int opcao = 0;

        while (opcao != 4) {
            //inicia classe menu
            Menu acao = new Menu(0);
            //pega o valor da opção escolhida
            opcao = acao.getOpcao();

            if (opcao == 1) {
                for (int i = 0; i < jogadores.size(); ++i) {
                    System.out.println("[" + (i + 1) + "] " + ((Jogador) jogadores.get(i)).getNome());
                }

                System.out.print("Digite o número do jogador: ");
                int idJogador = Integer.parseInt(sc.next()) - 1;
                //verifica se o valor digitado pelo usuario é valido
                if (idJogador >= 0 && idJogador < jogadores.size()) {
                    Jogador jogador = (Jogador) jogadores.get(idJogador);
                    System.out.println("Nome: " + jogador.getNome());
                    System.out.println("Pontos: " + jogador.getPontos());
                    System.out.println("Nível: " + jogador.getNivel());
                    System.out.println("===============");
                } else {
                    System.out.println("Jogador não encontrado!");
                    System.out.println("===============");
                }
            } else if (opcao == 2) {
                for (int i = 0; i < jogadores.size(); ++i) {
                    System.out.println("[" + (i + 1) + "] " + ((Jogador) jogadores.get(i)).getNome());
                }
                System.out.print("Digite o número do jogador: ");
                int idJogador = Integer.parseInt(sc.next()) - 1;
                if (idJogador >= 0 && idJogador < jogadores.size()) {
                    System.out.print("Digite os pontos a adicionar: ");
                    int somaPontos = Integer.parseInt(sc.next());
                    ((Jogador) jogadores.get(idJogador)).levelUp(somaPontos);
                }
                System.out.println("===============");

            } else if (opcao == 3) {
                System.out.print("Digite o nome do novo jogador: ");
                String novoJogador = sc.nextLine();
                //cria o novo objeto usando a classe array list
                jogadores.add(new Jogador(novoJogador, 0, 1));
                System.out.println("Jogador criado com sucesso!");
                System.out.println("===============");
            } else if (opcao == 4) {
                System.out.println("Saindo... Até a próxima!");
            } else if (opcao >= 5) {
                System.out.println("Opção inválida!");
            }

        }
    }
}