package atividadesAula01;


import java.util.Scanner;

public class Aula01_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número para o dobro");
        int numero = sc.nextInt();

        System.out.println("O dobro é " + numero*2);

        sc.close();

    }
}
