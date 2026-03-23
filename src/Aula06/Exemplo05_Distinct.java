package Aula06;

import java.util.List;

public class Exemplo05_Distinct {
    public static void main(String[] args) {
        List<Integer> numerosRepetidos = List.of(1,2,3,2,2,5,5);

        numerosRepetidos.stream()
                .distinct()
                .forEach(n -> System.out.println(n));

        Long totalNaoRepetido = numerosRepetidos.stream().distinct().count();

        System.out.println("Quantidade de números na lista " + numerosRepetidos.size());
        System.out.println("Quantidade de números não repetidos na lista " + totalNaoRepetido);
    }
}
