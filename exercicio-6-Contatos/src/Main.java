import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Kelvin", "41995843741"));
        agenda.adicionarContato(new Contato("Maria", "41996242046"));

        int id;
        while (opcao != 4) {
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Editar Contato");
            System.out.println("[3] Visualizar Contatos");
            System.out.println("[4] Sair");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                System.out.println("Digite o nome do contato: ");
                String nome = sc.nextLine();
                System.out.println("Digite o telefone do contato: ");
                String telefone = sc.nextLine();
                Contato novoContato = new Contato(nome, telefone);
                agenda.adicionarContato(novoContato);
                System.out.println("Contato adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("Digite o ID do contato: ");

                //funcao para listar contatos
                agenda.listarContatos();
                id = Integer.parseInt(sc.nextLine());
                int opcaoAlt = 0;

                while(opcaoAlt != 4 && opcaoAlt !=3) {
                    System.out.println("Qual informação deseja alterar? ");
                    System.out.println("[1] Alterar Nome");
                    System.out.println("[2] Alterar Telefone");
                    System.out.println("[3] Excluir Contato");
                    System.out.println("[4] Voltar");

                    opcaoAlt = Integer.parseInt(sc.nextLine());

                    if (opcaoAlt == 1) {
                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        agenda.alterarNome(id, novoNome);
                    } else if (opcaoAlt == 2) {
                        System.out.println("Digite o novo número: ");
                        String novoTelefone = sc.nextLine();
                        agenda.alterarNumero(id, novoTelefone);

                    } else if (opcaoAlt == 3) {
                        agenda.removerContato(id);
                        System.out.println("Contato removido com sucesso!");
                        System.out.println("==========");
                    } else if (opcaoAlt == 4) {

                    } else if (opcaoAlt >= 5) {
                        System.out.println("Opção invalida!");
                    }
                }

            } else if (opcao == 3) {
                agenda.listarContatos();
                System.out.println("==========");
            } else if (opcao == 4) {
                System.out.println("Até a próxima!");
            } else if (opcao >= 5) {
                System.out.println("Opção Invalida!");
            }
        }

    }
}