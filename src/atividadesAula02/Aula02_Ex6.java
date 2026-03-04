package atividadesAula02;

import java.util.Scanner;

public class Aula02_Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contagemVendedor = 1;

        do {
            System.out.println("Insira o valor vendido pelo vendedor " + contagemVendedor);


            contagemVendedor++;
        } while(contagemVendedor <= 5);



    }
}
