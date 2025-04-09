import java.util.Scanner;

public class Atendente {
    Scanner sc = new Scanner(System.in);
    Historico historico = new Historico();
    int contadorPedido = 4;

    public Atendente(Historico historico) {
        this.historico = historico;
    }

    void opcoesMenu() {
        System.out.println("[1]Novo Pedido");
        System.out.println("[2]Histórico");
        int opcaoMenu = Integer.parseInt(sc.nextLine());

        if (opcaoMenu == 1) {
            fazerPedido();
        } else if (opcaoMenu == 2) {
            historico.mostrarHistorico();
        } else {
            System.out.println("Opcao inválida");
        }
    }

    public void fazerPedido() {
        System.out.println("Informe o cliente");
        System.out.println("[1] Kelvin");
        System.out.println("[2] Jessica");
        System.out.println("[3] Matheus");
        System.out.println("[4] Novo Cliente");
        String cliente = "";
        String endereco = "";

        switch (Integer.parseInt(sc.nextLine())) {
            case 1 -> {
                cliente = "Kelvin";
                endereco = "Rua A, 123";
            }
            case 2 -> {
                cliente = "Jessica";
                endereco = "Rua B, 456";
            }
            case 3 -> {
                cliente = "Matheus";
                endereco = "Rua C, 789";
            }
            case 4 -> {
                System.out.print("Nome: ");
                cliente = sc.nextLine();
                System.out.print("Endereço: ");
                endereco = sc.nextLine();
            }
            default -> {
                cliente = "Desconhecido";
                endereco = "Sem endereço";
            }
        }

        Pedido pedido = new Pedido(cliente, endereco, contadorPedido++);

        System.out.println("Informe o tamanho");
        System.out.println("[1] Pizza Broto");
        System.out.println("[2] Pizza Media");
        System.out.println("[3] Pizza Grande");
        int opcaoTamanho = Integer.parseInt(sc.nextLine());
        String tamanho = switch (opcaoTamanho) {
            case 1 -> "Broto";
            case 2 -> "Media";
            case 3 -> "Grande";
            default -> "Desconhecido";
        };
        double preco = switch (opcaoTamanho) {
            case 1 -> 20.0;
            case 2 -> 30.0;
            case 3 -> 40.0;
            default -> 0;
        };
        System.out.println("Informe o sabor");
        System.out.println("[1] Bacon");
        System.out.println("[2] Frango");
        System.out.println("[3] Calabresa");
        int opcaoSabor = Integer.parseInt(sc.nextLine());
        String sabor = switch (opcaoSabor) {
            case 1 -> "Bacon";
            case 2 -> "Frango";
            case 3 -> "Calabresa";
            default -> "Desconhecido";
        };
        Produto produto = new Produto(sabor, tamanho, preco);
        pedido.adicionarProduto(produto);
        historico.adicionarPedido(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }
}