package praTestes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0;
        int opMenu = 0;

        Scanner scanner = new Scanner(System.in);

        String[][] cadastroNinjas = new String[3][3];

        Ninja n1 = new Ninja();

        while (opMenu != 4){
        System.out.println("===========");
        System.out.println("\tMenu");
        System.out.println("===========");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Exibir");
        System.out.println("3 - Excluir");
        System.out.println("4 - Sair");
        System.out.print(":");

        opMenu = scanner.nextInt();
        scanner.nextLine();
            switch (opMenu){
                case 1:
                    System.out.print("Nome: ");
                    n1.name = scanner.nextLine();

                    System.out.print("Idade: ");
                    n1.age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Aldeia: ");
                    n1.aldeia = scanner.nextLine();

                    cadastroNinjas[cont][cont] = n1.name;
                    cont++;
                    cadastroNinjas[cont][cont] = String.valueOf(n1.age);
                    cont++;
                    cadastroNinjas[cont][cont] = n1.aldeia;
                    cont++;
                    break;

                case 2:
                    if (cont == 0){
                        System.out.println("Cadastro Vazio");
                        break;
                    }else {
                        for (int j = 0; j < cadastroNinjas.length ; j++) {
                            for (int i = 0; i < cadastroNinjas.length; i++) {
                                System.out.println(cadastroNinjas[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Flw");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
