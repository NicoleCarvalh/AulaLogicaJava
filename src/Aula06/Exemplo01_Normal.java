package Aula06;

import java.util.List;

public class Exemplo01_Normal {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,3,6,8,2,9);

        for(int n : numeros){
            if(n>5){
                System.out.println(n * 2);
            }
        }
    }
}
