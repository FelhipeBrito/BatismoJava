package Desafios.D2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        int resposta = 0;
        int cont = 0; // Conta quantos ninjas foram cadastrados

        Scanner scanner = new Scanner(System.in);
        String[] cadastroNinjas = new String[10];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Excluir Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                resposta = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("DIGITE APENAS NÚMEROS! ");
                scanner.nextLine();
                continue;
            }

            switch (resposta) {
                case 1:
                    if (cont >= cadastroNinjas.length) {
                        System.out.println("\nCadastro Cheio!\n");
                    } else {
                        System.out.print("Nome ninja: ");
                        String nomeNinja = scanner.nextLine();
                        cadastroNinjas[cont] = nomeNinja;
                        cont++;
                    }
                    break;

                case 2:
                    if (cont == 0) {
                        System.out.println("\nCadastro Vazio!\n");
                    } else {
                        System.out.println("Lista de Ninjas:");
                        for (int i = 0; i < cont; i++) {
                            System.out.println((i + 1) + " - " + cadastroNinjas[i]);
                        }
                    }
                    break;

                case 3:
                    if (cont == 0) {
                        System.out.println("\nCadastro Vazio!\n");
                    } else {
                        System.out.println("Qual Ninja deseja Excluir?");
                        for (int i = 0; i < cont; i++) {
                            System.out.println((i + 1) + " - " + cadastroNinjas[i]);
                        }

                        int excluiNinja;
                        try {
                            System.out.print("Digite o número do ninja: ");
                            excluiNinja = scanner.nextInt();
                            scanner.nextLine();

                            // Ajustando o índice para array (usuário vê de 1 a N, mas array começa em 0)
                            int indice = excluiNinja - 1;

                            if (indice < 0 || indice >= cont) {
                                System.out.println("Índice inválido.");
                            } else {
                                // Remove deslocando os elementos para a esquerda
                                for (int i = indice; i < cont - 1; i++) {
                                    cadastroNinjas[i] = cadastroNinjas[i + 1];
                                }
                                cadastroNinjas[cont - 1] = null; // Apaga o último
                                cont--; // Decrementa o contador de ninjas
                                System.out.println("Ninja removido com sucesso!");
                            }
                        } catch (Exception e) {
                            System.out.println("DIGITE APENAS NÚMEROS! ");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nAsta la Vista Baby :P");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (resposta != 4);

        scanner.close();
    }
}
