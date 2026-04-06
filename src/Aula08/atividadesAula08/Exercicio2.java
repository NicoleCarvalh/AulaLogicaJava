package Aula08.atividadesAula08;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio2 {
    static Scanner sc = new Scanner(System.in);

    static HashMap<String, Integer> candidatos = new HashMap<>();

    public static void main(String[] args) {
        int opcao = 0;

        candidatos.put("Gio", 0);
        candidatos.put("Clau", 0);

        do {
            System.out.println("\n ====== SISTEMA DE VOTO ======");
            System.out.println("1. Registrar voto");
            System.out.println("2. Exibir resultado parcial");
            System.out.println("3. Exibir vencedor");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            switch(opcao){
                case 1:
                    System.out.println("Para registar voto, informe o candidato ");
                    String candidato = sc.nextLine();
                    registrarVoto(candidato);
                    break;

                case 2:

                    break;

                case 3:

                    break;

            }

        } while (opcao != 4);

        sc.close();

    }

    public static void registrarVoto(String candidato){

        if(candidatos.containsKey(candidato)){
            candidatos.get(candidato) ;
        }

    }

    public static void exibirParcial(){

    }

    public static void exibirVencedor(){

    }




}
