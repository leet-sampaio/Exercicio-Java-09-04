import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o seu nome completo: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Informe o seu saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        int opcao;

        do {
            System.out.println("\n--- Sistema do Banco Sampaio ---");
            System.out.println("1. Depósito!");
            System.out.println("2. Saque");
            System.out.println("3. Consulta de saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Informe o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Saindo do sistema! Volto logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Se atente!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}