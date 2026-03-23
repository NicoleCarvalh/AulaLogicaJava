package Aula01;

import javax.swing.*;

public class Aula01_PedidoDeNamoro {
    public static void main(String[] args) {
        int resposta;

        do {
            resposta = JOptionPane.showConfirmDialog(null, "Quer namorar comigo?", "Pedido Especial", JOptionPane.YES_NO_OPTION);

            // 1 é não, 0 é sim
            if (resposta == 1){
                JOptionPane.showMessageDialog(null, "Opa kkkkk, acho que você clicou errado! Vai de novo");
            } else if (resposta == -1) {
                JOptionPane.showMessageDialog(null, "Errou de novo kkk 🔪");
            }
        } while (resposta != 0);

        JOptionPane.showMessageDialog(null, "Agora sim! Já te amo rsrs!");

    }
}
