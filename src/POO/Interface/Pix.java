package POO.Interface;

public class Pix implements Pagavel{


    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Enviando Pix de R$%.2f %n", valor);
        return true;
    }

    @Override
    public boolean cancelarPagamento(String idTransacao) {
        System.out.printf("Estornado Pix %s %n", idTransacao);
        return true;
    }
}
