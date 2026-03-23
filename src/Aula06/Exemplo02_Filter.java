package Aula06;

import java.util.Arrays;
import java.util.List;

public class Exemplo02_Filter {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,5,7,5,6);

        numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
    }
}
