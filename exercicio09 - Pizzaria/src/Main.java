import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Historico historico = new Historico();

        // Criando 3 pedidos prontos
        Pedido p1 = new Pedido("Kelvin", "Rua A, 123", 1);
        p1.adicionarProduto(new Produto("Calabresa", "Média", 30.0));
        historico.adicionarPedido(p1);

        Pedido p2 = new Pedido("Jessica", "Rua B, 456", 2);
        p2.adicionarProduto(new Produto("Frango", "Grande", 40.0));
        historico.adicionarPedido(p2);

        Pedido p3 = new Pedido("Matheus", "Rua C, 789", 3);
        p3.adicionarProduto(new Produto("Bacon", "Broto", 20.0));
        historico.adicionarPedido(p3);

        Atendente atendente = new Atendente(historico);

        while (true) {
            atendente.opcoesMenu();
        }
    }
}