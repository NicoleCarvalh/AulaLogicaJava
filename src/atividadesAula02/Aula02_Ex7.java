package atividadesAula02;

import java.util.Scanner;

public class Aula02_Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tamanho;
        double tamanhoArredondado;

        do {
            System.out.println("Digite abaixo o tamanho da cruz (apenas números ímpares)");
            tamanho = sc.nextInt();
        } while (tamanho % 2 == 0);

        System.out.println("O número " + tamanho + " é ímpar");

        for(int r=1; r<=tamanho; r++){
            tamanhoArredondado = Math.ceil(tamanho/2);
            for (int c = 1; c<=tamanho; c++){
                if(r == tamanhoArredondado || c == tamanhoArredondado){
                    System.out.print("#");
                }else if (c != tamanhoArredondado){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
