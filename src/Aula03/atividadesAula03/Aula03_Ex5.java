package Aula03.atividadesAula03;

import java.util.Scanner;

public class Aula03_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numerosSorteados = {18, 22, 26, 48, 52, 54};

        int [] numerosParaVerificar = new int[6];

        int acertos = 0;

        for (int i = 0; i < numerosParaVerificar.length; i++){
            System.out.println("Insira o " + (i + 1) + "º número para verificar");
            numerosParaVerificar[i] = sc.nextInt();
        }

        for (int i = 0; i < numerosSorteados.length; i++){
            for (int j = 0; i < numerosParaVerificar.length; i++){
                if (numerosParaVerificar[i] == numerosSorteados[i]){
                    acertos++;
                }
            }
        }

        if(acertos == 6){
            System.out.println("Você acertou a SENA!");
        }else if (acertos == 5){
            System.out.println("Você acertou a QUINA!");
        }else if (acertos == 4){
            System.out.println("Você acertou a QUADRA!");
        }else {
            System.out.println("Você não acertou ... Mas não fique triste! Tente novamente e teste sua sorte!");
        }

        sc.close();
    }
}
