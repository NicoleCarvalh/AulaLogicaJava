package Aula06.atividadesAula06;

import java.util.List;

public class Aula06_Ex2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(3, 15, 7, 22, 1, 18, 9);

        List<Integer> saida = numeros.stream().filter(n -> n > 9).toList();

        System.out.println(saida);
    }
}
