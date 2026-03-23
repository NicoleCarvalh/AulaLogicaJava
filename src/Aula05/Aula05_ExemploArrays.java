package Aula05;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Aula05_ExemploArrays {
    public static void main(String[] args) {

        // ARRAYS.SORT
        int[] numeros = {5, 2, 8, 1, 9, 3};

        Arrays.sort(numeros);

        // Retorna o endereço na memória
        System.out.println(numeros);

        System.out.println(Arrays.toString(numeros));

        // ARRAYS.FILL
        int[] notas = new int[5];

        System.out.println(Arrays.toString(notas));

        Arrays.fill(notas, 20);

        System.out.println(Arrays.toString(notas));

        // ARRAYS.COPYOF
        System.out.println("------- CopyOf ------");

        int[] original = {1,3,5,6,8,7};
        int[] copia = Arrays.copyOf(original, 3); // copia os três primeiros
        System.out.println(Arrays.toString(copia));

        // ARRAYS.EQUALS
        System.out.println("--------- Equals ---------");
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {4, 2, 3};

        System.out.println(a == b); // Retorna falso porque está comparando a referência da memória
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
    }
}
