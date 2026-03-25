package Aula06.atividadesAula06;

import java.util.List;

public class Aula06_Ex3 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 2, 8, 1, 9, 3, 7);

        List<Integer> saida = numeros.stream().filter(n -> n % 2 == 1).sorted().toList();

        System.out.println(saida);
    }
}
