package Aula06;

import java.util.List;

public class Exemplo03_Map {
    public static void main(String[] args) {
        List<String> alunos = List.of("murilo", "Nicole", "LuCAs", "PEdro");

        // Fonte
        alunos.stream()
                .map(nome -> nome.toUpperCase())
                .sorted()
                .forEach(nome -> System.out.println(nome));
    }
}
