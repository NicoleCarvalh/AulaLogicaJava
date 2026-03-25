package Aula06.atividadesAula06;

import java.util.List;

public class Aula06_Ex4 {
    public static void main(String[] args) {
        List<Double> precos = List.of(30.0, 75.0, 120.0, 45.0, 90.0, 15.0, 60.0);

        List<Double> saida = precos.stream().filter(n -> n > 50).map(n -> n - (n*0.5)).toList();

        System.out.println(saida);
    }
}
