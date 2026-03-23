package Aula05.atividadesAula05;

import java.util.Arrays;

public class Aula05_MaioresNotas {
    public static void main(String[] args) {
        int[] notas = {7,3,9,6,2,8};

        Arrays.sort(notas);

        int[] copia = Arrays.copyOf(notas, 3);

        System.out.println(Arrays.toString(copia));

        int tamanhoLista = notas.length - 1;

        System.out.println("Maior nota: " + notas[tamanhoLista]);
    }
}
