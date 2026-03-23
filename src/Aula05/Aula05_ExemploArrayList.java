package Aula05;

import java.util.ArrayList;
import java.util.List;

public class Aula05_ExemploArrayList {
    public static void main(String[] args) {
        String[] linguagens = new String[2];

        linguagens[0] = "Java";
        linguagens[1] = "Python";
//        linguagens[2] = "Javascript";

        // Operador diamante
        List<String> melhoresLinguagens = new ArrayList<String>();
        melhoresLinguagens.add("Java");
        melhoresLinguagens.add("Golang");
        melhoresLinguagens.add("Typescript");

        System.out.println(melhoresLinguagens);

        // GET
        System.out.println(melhoresLinguagens.get(1));
        // SIZE
        System.out.println(melhoresLinguagens.get(melhoresLinguagens.size() - 1));

        // REMOVE
        melhoresLinguagens.remove("Golang");
        System.out.println("Melhores linguagens depois da remoção " + melhoresLinguagens);

        // CONTAINS - Case sensitive
        System.out.println(melhoresLinguagens.contains("Python"));
        System.out.println(melhoresLinguagens.contains("Typescript"));

        melhoresLinguagens.add("Kotlin");
        melhoresLinguagens.add("Rust");
        melhoresLinguagens.add("C#");

        // PERCORRER FOR TRADICIONAL
        System.out.println("====== FOR TRADICIONAL =====");
        for (int i = 0; i < melhoresLinguagens.size(); i++){
            System.out.println(melhoresLinguagens.get(i));
        }

        // PERCORRER FOR EACH
        System.out.println("====== FOR EACH =====");
        for (String l: melhoresLinguagens){
            System.out.println(l);
        }

    }
}
