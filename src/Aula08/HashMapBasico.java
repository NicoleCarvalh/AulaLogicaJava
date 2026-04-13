package Aula08;

import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapBasico {
    public static void main(String[] args) {
        // Passa o tipo de dado da chave e do valor
        HashMap<String, Integer> idades = new HashMap<>();

        // Add elementos
        idades.put("Maurício", 18);
        idades.put("Claudio", 22);

        System.out.println(idades.size());
        System.out.println("Hashmap " + idades);

        // Se inserir uma chave que não existe, aparece NULL
        // (não dá erro, apenas aparece null
        System.out.println("Idade do Claudio " + idades.get("Claudio"));

        System.out.println("Contém Claudio? " + idades.containsKey("Claudio"));
        System.out.println("Contém Clairo? " + idades.containsKey("Clairo"));

        System.out.println("Alguém tem 20 anos? " + idades.containsValue(20));

        System.out.println("Hoje é aniversário do Maurício :D");
        // Altera valor que estava antes ou adiciona
        idades.put("Maurício", 19);
        System.out.println("Agora ele tem "+ idades.get("Maurício"));


        System.out.println("Adicionar um elemento caso ele não exista");
        idades.putIfAbsent("Carlos", 20);
        idades.putIfAbsent("Flavio", 20);

        System.out.println(idades);

        System.out.println("Atualizar o valor se a chave existir");
        idades.replace("Thiago", 23);
        idades.replace("Gabriel", 19);

        System.out.println(idades);

        // Retorna lista só com as chaves
        for(String nome : idades.keySet()){
            System.out.println(" - " + nome);
        }

        // Retorna lista só com os valores
        for(Integer nome : idades.values()){
            System.out.println(" - " + nome);
        }

        // Retorna com os dois
        for(HashMap.Entry<String, Integer> entry : idades.entrySet()){
            System.out.println(" " + entry.getKey() + " tem " + entry.getValue() + " anos");
        }

        // uso de getOrDefault
        int idadeBruna = idades.getOrDefault("Bruna", 0);
        int idadeRafael = idades.getOrDefault("Rafael", 0);


        String feijao = "Feijão";


        for (char c : feijao.toCharArray()){
            System.out.println();
        }
    }
}
