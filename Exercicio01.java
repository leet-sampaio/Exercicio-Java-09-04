import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static double adicionar(double numero01, double numero02) {
        return numero01 + numero02;
    }

    public static double subtrair(double numero01, double numero02) {
        return numero01 - numero02;
    }

    public static double multiplicar(double numero01, double numero02) {
        return numero01 * numero02;
    }

    public static double dividir(double numero01, double numero02) {
        return numero01 / numero02;
    }

    //Ajuste para formatar o resultado com ou sem casas decimais.

    public static String formatarResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.format("%d", (long) resultado);
        } else {
            return String.format(Locale.US, "%.2f", resultado);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Ajuste para permitir a entrada de números com ponto.

        double numero01 = 0;
        double numero02 = 0;

        try {
            System.out.print("Informe o primeiro número: ");
            numero01 = scanner.nextDouble();

            System.out.print("Informe o segundo número: ");
            numero02 = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("DIGITE UM NÚMERO VÁLIDO COM PONTO COMO SEPARADOR DECIMAL.");
            scanner.close();
            return;
        }

        scanner.nextLine();

        System.out.print("Escolha um dos métodos: + para adição, - para subtração, / para divisão ou * para multiplicação. ");
        String metodo = scanner.next();

        switch (metodo) {
            case "+":
                System.out.println("Resultado da soma: " + formatarResultado(adicionar(numero01, numero02)));
                break;

            case "-":
                System.out.println("Resultado da subtração: " + formatarResultado(subtrair(numero01, numero02)));
                break;

            case "/":
                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println("Resultado da divisão: " + formatarResultado(dividir(numero01, numero02)));
                }
                break;

            case "*":
                System.out.println("Resultado da multiplicação: " + formatarResultado(multiplicar(numero01, numero02)));
                break;

            default:
                System.out.println("Erro! Operação inválida!");
        }

        scanner.close();
    }
}

