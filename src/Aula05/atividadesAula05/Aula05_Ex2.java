package Aula05.atividadesAula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula05_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int soma = 0;

        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos números deseja inserir: ");
        int repeticao = sc.nextInt();

        for(int i = 0; i < repeticao; i++){
            System.out.println("Insira o " + (i+1) + " número");
            numero = sc.nextInt();
            numeros.add(numero);
        }

        for (int n : numeros){
            soma += n;
        }

        System.out.println("Entrada: " + numeros);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
