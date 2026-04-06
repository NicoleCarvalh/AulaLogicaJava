package Aula07;

public class SomaMatriz {
    public static void main(String[] args) {
        int somaLinha = 0;

        int [][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        for (int c = 0; c < matriz.length; c++){
            for(int r = 0; r < matriz[c].length; r++){
                somaLinha = somaLinha  + matriz[c][r];
            }
            System.out.printf("Linha %d, soma: %d", c, somaLinha);
            System.out.println();
            somaLinha = 0;
        }
    }
}
