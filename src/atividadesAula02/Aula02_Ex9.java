package atividadesAula02;

import java.util.Scanner;

public class Aula02_Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int penultimoNumero = 0;
        int ultimoNumero = 1;
        int proxNumero = 0;

        System.out.println("Digite o número a ser mostrado na sequência Fibonacci");
        int numeroSequencia = sc.nextInt();

        for(int i=0; i < numeroSequencia; i++){
            System.out.print(penultimoNumero + " ");
            proxNumero = penultimoNumero + ultimoNumero;

            penultimoNumero = ultimoNumero;
            ultimoNumero = proxNumero;

        }

        sc.close();
    }
}
