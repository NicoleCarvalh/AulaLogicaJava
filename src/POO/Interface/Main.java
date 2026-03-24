package POO.Interface;

public class Main {
    public static void realizarCompra(Pagavel metodoDePagamento, double valor){
        boolean sucesso = metodoDePagamento.processarPagamento(valor);

        if(sucesso){
            System.out.println("Compra realizada com sucesso!");
        }
    }

    public static void main(String[] args){
        realizarCompra(new Pix(), 150);
    }
}
