package Aula01;

import javax.swing.*;

public class Aula01_JOptionPane {
    public static void main(String[] args) {
        // Saída
        JOptionPane.showMessageDialog(null, "Seja bem vindo");

        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");

        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}
