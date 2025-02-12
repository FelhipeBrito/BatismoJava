package praTestes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int op = 0;
        int contPares = 0;
        int contImpar = 0;

        System.out.println("Pares ou impares!");
        System.out.print("Digite um número inteiro:");

        try {
            op = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Somente números inteiros!");
        }

        int[] numeros = new int[op];

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            if (numeros[i] % 2 == 0){
                contPares++;
                pares.add(numeros[i]);
            }else {
                contImpar++;
                impares.add(numeros[i]);
            }
        }
        System.out.println("Pares: " + contPares);
        for (int num:pares){
            System.out.print(" - " + num);
        }
        System.out.println();
        System.out.println("Impares: "+ contImpar);
        for (int num:impares){
            System.out.print(" - " + num);
        }
        /*
        * GPT CODE
        *
        * package praTestes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        System.out.println("Pares ou Ímpares!");
        System.out.print("Digite um número inteiro positivo: ");

        // Verifica se o usuário digitou um número válido
        if (scanner.hasNextInt()) {
            op = scanner.nextInt();

            // Verifica se o número é positivo
            if (op <= 0) {
                System.out.println("Por favor, digite um número inteiro positivo.");
            } else {
                List<Integer> pares = new ArrayList<>();
                List<Integer> impares = new ArrayList<>();

                // Percorre os números de 1 até op
                for (int i = 1; i <= op; i++) {
                    if (i % 2 == 0) {
                        pares.add(i);
                    } else {
                        impares.add(i);
                    }
                }

                // Exibe os resultados formatados
                System.out.println("\nTotal de números pares: " + pares.size());
                System.out.println("Pares: " + pares);

                System.out.println("\nTotal de números ímpares: " + impares.size());
                System.out.println("Ímpares: " + impares);
            }
        } else {
            System.out.println("Erro! Somente números inteiros são permitidos.");
        }

        scanner.close();
    }
}
*/


       scanner.close();


    }
}
