package Desafios.D5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opMenu;

        Scanner sc = new Scanner(System.in);

        List<ContaCorrente> CC = new ArrayList<>();
        List<ContaPoupanca> CP = new ArrayList<>();

        System.out.println("===============");
        System.out.println("BANCO DE KONOHA");
        System.out.println("===============\n");

        System.out.println("1 - Acessar Conta");
        System.out.println("2 - Criar Conta");
        System.out.println("3 - SAIR");
        System.out.print(":");
        opMenu = sc.nextInt();
        sc.nextLine();

        switch (opMenu){
            case 1:
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                System.out.print(":");
                opMenu = sc.nextInt();
                if (opMenu == 1){
                    System.out.print("Nome");

                }

                break;
            case 2:
                System.out.println("CRIAR CONTA");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                System.out.print(":");

                opMenu = sc.nextInt();
                sc.nextLine();

                if (opMenu == 1){
                    ContaCorrente cc1 = new ContaCorrente();

                    System.out.print("Nome: ");
                    cc1.nome = sc.nextLine();
                    CC.add(cc1);
                    System.out.println("Bem vindo, "+ cc1.nome+ " CC criada");

                } else if (opMenu == 2) {
                    ContaPoupanca cp1 = new ContaPoupanca();
                    System.out.print("Nome: ");
                    cp1.nome = sc.nextLine();
                    CP.add(cp1);
                    System.out.println("CP criada");
                }else {
                    System.out.println("Opção Inválida!");
                }
                break;
            case 3:
                System.out.println("Até a próxima! :)");
                break;
        }







        sc.close();
    }
}
