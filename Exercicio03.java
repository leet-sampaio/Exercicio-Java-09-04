import java.util.Scanner;

public class Exercicio03 {

    static class ContaBancaria {
        private int numeroConta;
        private String nomeTitular;
        private double saldo;

        public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
            this.saldo = saldoInicial;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public String getNomeTitular() {
            return nomeTitular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
            } else {
                System.out.println("<Valor de depósito inválido.>");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
            } else if (valor <= 0) {
                System.out.println("<Valor de saque inválido.>");
            } else {
                System.out.println("<Saldo insuficiente para realizar o saque.>");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual da conta " + this.numeroConta + " (Titular: " + this.nomeTitular + "): R$" + String.format("%.2f", this.saldo));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

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