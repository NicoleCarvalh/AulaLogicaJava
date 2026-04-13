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
            System.out.println("\n====== SISTEMA DE VOTO ======");
            System.out.println("\nCandidato 1: Gio");
            System.out.println("Candidato 2: Clau\n");
            System.out.println("1. Registrar voto");
            System.out.println("2. Exibir resultado parcial");
            System.out.println("3. Exibir vencedor");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch(opcao){
                case 1:
                    System.out.println("Para registar voto, informe o candidato pelo nome");
                    System.out.println("Candidato 1: Gio");
                    System.out.println("Candidato 2: Clau\n");
                    System.out.print("Votar em: ");
                    String candidato = sc.nextLine();
                    registrarVoto(candidato);
                    System.out.println("Voto registrado para " + candidato + "!");
                    break;

                case 2:
                    exibirParcial();
                    break;

                case 3:
                    exibirVencedor();
                    break;

                case 4:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 4);

        sc.close();

    }

    public static void registrarVoto(String candidato){

        if(candidatos.containsKey(candidato)){
            int voto = candidatos.get(candidato);
            candidatos.put(candidato, voto+1);
        }

    }

    public static void exibirParcial(){

        System.out.println("===== RESULTADO PARCIAL =====");
        for(HashMap.Entry<String, Integer> entry : candidatos.entrySet()){
            System.out.println(" " + entry.getKey() + " tem " + entry.getValue() + " votos");
        }

    }

    public static void exibirVencedor(){

        System.out.println("======== VENCEDOR =======");

        if(candidatos.get("Gio") > candidatos.get("Clau")){
            System.out.println("O vencedor é Gio com " + candidatos.get("Gio") + " votos");
        } else if (candidatos.get("Gio") < candidatos.get("Clau")){
            System.out.println("O vencedor é Clau com "  + candidatos.get("Clau") + " votos" );
        } else if (candidatos.get("Gio").equals(candidatos.get("Clau"))){
            System.out.println("Houve um empate entre Gio e Clau");
        }

    }



}
