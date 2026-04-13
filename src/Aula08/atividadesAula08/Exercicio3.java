package Aula08.atividadesAula08;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> contagemLetras = new HashMap<>();

        System.out.println("Insira a palavra para verificar a contagem de letras: ");
        String palavra = sc.nextLine();


        for (char c : palavra.toCharArray()){
            if(contagemLetras.containsKey(c)){
                int contagem = contagemLetras.get(c)+1;
                contagemLetras.replace(c, contagem);
            } else {
                contagemLetras.put(c, 1);
            }
        }

        System.out.println(contagemLetras);

        sc.close();
    }
}
