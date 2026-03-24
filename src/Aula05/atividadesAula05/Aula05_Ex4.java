package Aula05.atividadesAula05;

import java.util.ArrayList;
import java.util.List;

public class Aula05_Ex4 {
    public static void main(String[] args) {
        List<Integer> listaDuplicados = new ArrayList<>(List.of(1,2,2,3,4,4,5));

        List<Integer> saida = new ArrayList<>();

        for(int n: listaDuplicados){
            if(saida.contains(n)){
                continue;
            } else {
                saida.add(n);
            }
        }

        System.out.println(saida);
    }

}
