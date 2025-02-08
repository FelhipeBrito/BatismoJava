package NivelFacil.NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
         * Switch - casos especificos*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolhar um personagem:");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int escolhaUsuario = scanner.nextInt();


        switch (escolhaUsuario){
            case 1:
                System.out.println("Escolheu Naruto");
                break;
            case 2:
                System.out.println("Escolheu Sasuke");
                break;
            case 3:
                System.out.println("Escolheu Sakura");
                break;
            default:
                System.out.println("So tem 3 opçoes seu burro!");
        }




        scanner.close();

    }

}
