package atividadesAula02;

import java.util.Scanner;

public class Aula02_Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para desenhar o quadrado");
        int tamanho = sc.nextInt();

        for(int r = 1; r <=tamanho; r++){
            for(int c=1; c <= tamanho; c++){
                if((r == 1 || c == 1) || (r == tamanho || c == tamanho)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
