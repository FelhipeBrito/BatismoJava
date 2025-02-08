package NivelFacil.NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    /*
    * Scanner
    * */
    public static void main(String[] args) {
        System.out.print("Digite: ");
        Scanner caixaDeTexto = new Scanner(System.in);
        String texto = caixaDeTexto.nextLine();

        System.out.println("Idade:");
        int age = caixaDeTexto.nextInt();
        System.out.println(texto);
        System.out.println(age);



        caixaDeTexto.close();
    }

}
