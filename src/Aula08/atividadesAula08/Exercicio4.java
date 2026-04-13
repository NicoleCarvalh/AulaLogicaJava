package Aula08.atividadesAula08;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> contagemLetras = new HashMap<>();

        System.out.println("Insira a palavra para verificar a letra: ");
        String palavra = sc.nextLine();

        for(char c : palavra.toCharArray()){
            if(contagemLetras.containsKey(c)){
                int contagem = contagemLetras.get(c)+1;
                contagemLetras.replace(c, contagem);
            } else {
                contagemLetras.put(c,1);
            }
        }

        for(char c : palavra.toCharArray()){
            if(contagemLetras.get(c).equals(1)){
                System.out.println(c);
                break;
            }
        }

        sc.close();
    }
}
