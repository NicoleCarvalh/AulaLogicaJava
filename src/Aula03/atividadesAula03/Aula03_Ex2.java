package Aula03.atividadesAula03;

import java.util.Scanner;

public class Aula03_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrayParaAdivinhar = {10, 5, 55, 89, 57, 2, 1, 8, 41, 20};
        int palpite;
        boolean numeroNaoExiste = false;

        System.out.println("Insira um número para adivinhar");
        palpite = sc.nextInt();

        for (int i = 0; i < arrayParaAdivinhar.length; i++){
            if (palpite == arrayParaAdivinhar[i]){
                System.out.println("Você acertou! :)) O número está na posição " + (i+1));
                break;
            } else {
                numeroNaoExiste = true;
            }
        }
        if (numeroNaoExiste) {
            System.out.println("O número não existe na lista. Você errou!");
        }


        sc.close();
    }
}
