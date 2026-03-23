package Aula01;

import javax.swing.*;

public class Aula01_ConvercaoJOptionPane {
    public static void main(String[] args) {
        // Show input dialog retorna SEMPRE string
        String entrada = JOptionPane.showInputDialog(null, "Digite um número");

        int numero = Integer.parseInt(entrada);

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número é par");
        } else {
            JOptionPane.showMessageDialog(null,"O número é ímpar");
        }

    }
}
