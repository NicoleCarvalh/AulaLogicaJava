package Aula05.atividadesAula05;

import java.util.Arrays;

public class Aula05_Ex1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));

    }
}
