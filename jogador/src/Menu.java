//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Menu {
    int opcao;
    Scanner sc;

    public Menu(int opcao) {
        this.sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("[1] Consultar dados do Jogador");
        System.out.println("[2] Adicionar pontos ao Jogador");
        System.out.println("[3] Adicionar novo Jogador");
        System.out.println("[4] Sair");
        this.opcao = Integer.parseInt(this.sc.next());
    }

    public int getOpcao() {
        return this.opcao;
    }
}
