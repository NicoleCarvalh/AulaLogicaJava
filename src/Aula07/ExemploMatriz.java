package Aula07;

public class ExemploMatriz {
    public static void main(String[] args) {
        // 3 linhas, 4 colunas
        int[][] matriz = new int[3][4];

        int[][] tabela = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(tabela[1][1]);
        System.out.println(tabela[0][0]);
        System.out.println(matriz.length); // quantidade de linhas
        System.out.println(matriz[0].length);

        for(int i = 0; i < tabela.length; i++){ // linha
            for (int j = 0; j < tabela[i].length; j++){ // colunas
                System.out.printf(tabela[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("========== For each");

        for(int[] linha : tabela){
            for(int valor: linha){
                System.out.printf(valor + "\t");
            }
            System.out.println();
        }

    }

}
