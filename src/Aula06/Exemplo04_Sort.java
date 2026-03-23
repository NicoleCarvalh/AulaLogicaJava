package Aula06;

import java.util.List;

public class Exemplo04_Sort {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5,1,8,3,9,2);

        // Compara o último valor com o próximo
        // se a comparação retornar negativo, o último valor vem antes do próximo
        // se a comparação retornar positivo, o último valor vem depois do próximo
        // se for zero, eles são iguais

//        numeros.stream()
//                .sorted()
//                .forEach(num -> System.out.println(num));

        numeros.stream()
                .sorted((a, b) -> b - a)
                .forEach(numero -> System.out.println(numero));
    }
}
