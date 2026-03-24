package POO.Interface;

public class CartaoCredito implements Pagavel{


    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Cobrando R$%.2f no cartão de crédito %n", valor);
        return true;
    }

    @Override
    public boolean cancelarPagamento(String idTransacao) {
        System.out.printf("Cancelando transação %s no cartão %n", idTransacao);
        return true;
    }
}
