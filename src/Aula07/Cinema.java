package Aula07;

import java.util.Scanner;

public class Cinema {

    private static char[][] sala = new char[5][8];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializar();

        int opcao = 0;

        do {
            System.out.println("\n ====== CINEMA ======");
            System.out.println("1. Ver mapa assento");
            System.out.println("2. Reservar assento");
            System.out.println("3. Cancelar assento");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1: exibirMapa(); break;
                case 2: reservar(); break;
                case 3: cancelar();break;
                default:
                    System.out.println("Opção inválida");
            }
        } while(opcao != 0);

        System.out.println("Tchau o/");

        sc.close();
    }

    private static void exibirMapa(){
        System.out.println("\n============== MAPA ==============");
        System.out.println("====== [ TELA FICA AQUI ] ========");
        System.out.print("   ");
        for(int i = 0; i < sala[0].length; i++){
            System.out.printf(" C%d", i);
        }
        System.out.println();

        for (int i = 0; i < sala.length; i++){
            System.out.printf("F%d", i);
            for (int j = 0; j < sala[0].length; j++){
                System.out.printf("  %c", sala[i][j]);
            }
            System.out.println();
        }
    }

    private static void inicializar(){
        for (int i = 0; i < sala.length; i++){
            for (int j = 0; j < sala[0].length; j++){
                sala[i][j] = 'L';
            }
        }
    }

    private static void reservar(){
        exibirMapa();
        System.out.println();
        System.out.println("Informe a fileira do assento escolhido");
        System.out.print("Fileira de 0 a 4: ");
        int fileira = sc.nextInt();

        System.out.println("Informe a coluna do assento escolhido");
        System.out.print("Coluna de 0 a 7: ");
        int coluna = sc.nextInt();

        if (sala[fileira][coluna] == 'L'){
            sala[fileira][coluna] = 'R';
            exibirMapa();
            System.out.printf("Assento F%d / C%d RESERVADO com sucesso!", fileira, coluna);
            System.out.println();
        } else {
            System.out.println("Assento já reservado! Tente outra cadeira.");
        }
    }

    private static void cancelar(){
        exibirMapa();
        System.out.println();
        System.out.println("Informe a fileira do assento para cancelar");
        System.out.print("Fileira de 0 a 4: ");
        int fileira = sc.nextInt();

        System.out.println("Informe a coluna do assento para cancelar");
        System.out.print("Coluna de 0 a 7: ");
        int coluna = sc.nextInt();

        if (sala[fileira][coluna] == 'R'){
            sala[fileira][coluna] = 'L';
            exibirMapa();
            System.out.printf("Assento F%d / C%d CANCELADO com sucesso!", fileira, coluna);
            System.out.println();
        } else {
            System.out.println("Assento não reservado! Tente novamente.");
        }
    }
}
