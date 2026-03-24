package POO.Interface;

public interface Pagavel {
    boolean processarPagamento(double valor);
    boolean cancelarPagamento(String idTransacao);
}
