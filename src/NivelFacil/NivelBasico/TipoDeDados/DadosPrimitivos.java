package NivelFacil.NivelBasico.TipoDeDados;


import java.util.Scanner;

public class DadosPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*byte idadeByte = 2;
        short idadeShort = 3;

        int idadeInt = 2147483647; //2147483647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        float saldo = 123f;
        Long saldoBancario = 99999L; //9tri

        System.out.println(idadeInt);
        System.out.println("ola, " + inicial);*/


        String logo = "\nBirigui Buster :P";
        String line = "------------------";
        String menu = "1 - Cadastrar\n2 - Exibir\n3 - Excluir\n4 - Sair\n";

        System.out.println(logo);
        System.out.println(line);
        System.out.println(menu);
        System.out.print(": ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("1 ");
                break;
            case 2:
                System.out.println("2 ");
                break;
            case 3:
                System.out.println("3 ");
                break;
            case 4:
                System.out.println("4 ");
                break;
            default:
                System.out.println("Opção Inválida!");
        }




        scanner.close();
    }
}
