package Aula06.atividadesAula06;

import java.util.List;
import java.util.stream.Collectors;

public class Aula06_Ex1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> saida = numeros.stream().filter(n -> n % 2 == 0).map(n -> n*3).toList();

        System.out.println(saida);
    }
}
