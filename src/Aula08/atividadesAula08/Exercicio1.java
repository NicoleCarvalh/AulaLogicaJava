package Aula08.atividadesAula08;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> paises = new HashMap<>();

        // Add países
        paises.put("Brasil", "Brasilia");
        paises.put("Irlanda", "Dublin");
        paises.put("Suécia", "Estocolmo");
        paises.put("Estados Unidos", "Washington DC");
        paises.put("Argentina", "Buenos Aires");

        System.out.println("Lista de países");
        for(HashMap.Entry<String, String> entry : paises.entrySet()){
            System.out.println(entry.getValue() + " é a capital de " + entry.getKey());
        }

        System.out.println();
        System.out.println("Digite o nome de um país");
        String paisParaVerificar = sc.nextLine();
        System.out.println();


        if (paises.containsKey(paisParaVerificar)){
            System.out.printf("A capital de %s é %s", paisParaVerificar, paises.get(paisParaVerificar));
        } else {
            System.out.println("País não encontrado");
        }

        sc.close();
    }

}
