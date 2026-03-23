package Aula01.atividadesAula01;

import javax.swing.*;
import java.util.Random;

public class Aula01_Ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        int contagemDeAcertos = 0;
        int tentativasRestantes = 3;


        // Contagem de acertos
        do {
            int valor1 = random.nextInt(10) + 1;
            int valor2 = random.nextInt(10) + 1;

            int mult = valor1 * valor2;

            String palpite = JOptionPane.showInputDialog(null,"Quanto é " + valor1 + " * " + valor2 + "?" );

            int palpiteConvertido = Integer.parseInt(palpite);


            if(palpiteConvertido == mult){
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Você acertou! Ainda faltam mais " + (tentativasRestantes)+ " acertos.");
                contagemDeAcertos++;
            } else {
                JOptionPane.showMessageDialog(null, "Você ERROU! Ainda faltam mais " + (tentativasRestantes) +  " acertos.");
                contagemDeAcertos++;
            }

            if(contagemDeAcertos == 3){
                JOptionPane.showMessageDialog(null, "Parabéns! Você venceu!");
            }
        } while (contagemDeAcertos < 3);



    }
}
