package Aula06.atividadesAula06;

import java.util.List;

public class Aula06_Ex5 {
    public static void main(String[] args) {
        List<String> frutas = List.of(
                "abacaxi", "Banana", "LARANJA", "uva", "Maçã", "ABACATE", "kiwi", "banana"
        );

        List<String> saida = frutas.stream().map(n -> n.toLowerCase()).distinct().filter(n -> n.length() >= 5).sorted().toList();

        System.out.println(saida);
    }
}
