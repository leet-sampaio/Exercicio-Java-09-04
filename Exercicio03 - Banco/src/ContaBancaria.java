 public class ContaBancaria {

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