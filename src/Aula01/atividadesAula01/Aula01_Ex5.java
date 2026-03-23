package Aula01.atividadesAula01;

import java.util.Scanner;

public class Aula01_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor para contagem de notas");
        int valorParaContagem = sc.nextInt();

        int notasDe100 = valorParaContagem/100;
        valorParaContagem = valorParaContagem % 100;

        int notasDe50 = valorParaContagem/50;
        valorParaContagem = valorParaContagem % 50;

        int notasDe20 = valorParaContagem/20;
        valorParaContagem = valorParaContagem % 20;

        int notasDe10 = (valorParaContagem % 20)/10;
        valorParaContagem = valorParaContagem % 10;

        int notasDe5 = (valorParaContagem % 10)/5;
        valorParaContagem = valorParaContagem % 5;

        int notasDe2 = (valorParaContagem % 5)/2;
        valorParaContagem = valorParaContagem % 2;

        int notasDe1 = valorParaContagem;

        System.out.println("Notas de 100: " + notasDe100);
        System.out.println("Notas de 50: " + notasDe50);
        System.out.println("Notas de 20: " + notasDe20);
        System.out.println("Notas de 10: " + notasDe10);
        System.out.println("Notas de 5: " + notasDe5);
        System.out.println("Notas de 2: " + notasDe2);
        System.out.println("Notas de 1: " + notasDe1);

        sc.close();
    }

}
