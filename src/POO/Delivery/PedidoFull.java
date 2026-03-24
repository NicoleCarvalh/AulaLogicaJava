package POO.Delivery;

public class PedidoFull extends Pedido {
    private int tempoPrevisto;

    public PedidoFull(String nomeCliente, String item, double valor, int tempoPrevisto) {
        super(nomeCliente, item, valor);
        this.tempoPrevisto = tempoPrevisto;
    }

    public void rastrear(){
        System.out.println("Entrega prevista em " + tempoPrevisto + " minutos!");
    }
}
