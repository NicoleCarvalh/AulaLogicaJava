package atividadesAula03;

import java.util.Scanner;

public class Aula03_Ex1 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite  o " + (i+1) + "º número:");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println("O " + (i+1) + "º número é: " + numeros[i]);

        }
        sc.close();
    }
}
