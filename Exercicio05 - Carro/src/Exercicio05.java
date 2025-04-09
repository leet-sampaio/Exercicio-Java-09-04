import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos carros deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Carro[] carros = new Carro[quantidade];

        for (int i = 0; i < carros.length; i++) {
            System.out.println("\nCadastro do carro " + (i + 1));

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Placa: ");
            String placa = scanner.nextLine();

            carros[i] = new Carro(marca, modelo, ano, placa);

            carros[i].acelerar(30);
            carros[i].frear(10);
        }


        System.out.println("\n--- INFORMAÇÕES DOS CARROS ---");
        for (Carro carro : carros) {
            carro.informacoes();
            System.out.println("------------------------------");
        }

        scanner.close();
    }
}
