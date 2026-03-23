package Aula03.atividadesAula03;

import java.util.Scanner;

public class Aula03_Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] listaNumeros = new int[10];

        int numeroParaVerificar;
        int contagemRepeticao = 0;

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Insira o " + (i + 1) + "º número: ");
            listaNumeros[i] = sc.nextInt();
        }

        System.out.println("Insira o número para verificar quantas vezes se repete: ");
        numeroParaVerificar = sc.nextInt();

        for (int i = 0; i < listaNumeros.length; i++){
            if(listaNumeros[i] == numeroParaVerificar){
                contagemRepeticao++;
            }
        }

        System.out.println("A lista de números é:");

        for(int i = 0; i < listaNumeros.length; i++){
            System.out.print(listaNumeros[i] + " ");

        }
        System.out.println(" ");
        System.out.println("O número " + numeroParaVerificar + " aparece " + contagemRepeticao + " vezes.");

        sc.close();
    }
}
