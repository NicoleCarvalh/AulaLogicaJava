package Aula06;

import java.util.List;

public class Exemplo01_Stream {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,3,6,8,2,9);

        numeros.stream().filter(n -> n > 5)
                .forEach(n -> System.out.println(n * 2));
    }
}
