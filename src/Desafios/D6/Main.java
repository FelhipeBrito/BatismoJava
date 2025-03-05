package Desafios.D6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        CadastroNinja cadastroNinja = new CadastroNinja();

        do {
            cadastroNinja.menu();

            try{
                opcao = sc.nextInt();
                sc.nextLine();
            }catch (Exception e){
                sc.nextLine();
            }

            switch (opcao){
                case 1:
                    Ninja ninja = new Ninja();

                    System.out.print("Nome Ninja: ");
                    ninja.setNome(sc.nextLine());

                    System.out.print("Idade Ninja:");
                    ninja.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Vila do Ninja: ");
                    ninja.setVila(sc.nextLine());

                    cadastroNinja.adicionarNinja(ninja);

                    break;
                case 2:
                    if (cadastroNinja.tamanhoCadastro() <= 0){
                        System.out.println("Cadastro Vazio!");
                    }else {
                        System.out.println(cadastroNinja.toString());
                    }
                    break;
                case 3:
                    if (cadastroNinja.tamanhoCadastro() <= 0){
                        System.out.println("Cadastro Vazio!");
                    }else{
                        System.out.println(cadastroNinja);
                        System.out.print("Nome Ninja Para Excluir: ");
                        String nomeExcluir = sc.nextLine();

                        Ninja ninjaExcluir = new Ninja();
                        ninjaExcluir.setNome(nomeExcluir);

                        cadastroNinja.removerNinja(ninjaExcluir);
                    }

                    break;
                case 4:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida! ");
            }

        }while (opcao != 4);


    sc.close();
    }
}
