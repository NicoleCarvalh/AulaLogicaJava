package Aula06;

import java.util.List;
import java.util.stream.Collectors;

public class Exemplo06_Collect {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6);

        // Salvar os valores pares da lista em uma nova lista
        List<Integer> valoresPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(valoresPares);
    }
}
