package POO.Delivery;

public class PedidoAgendado extends Pedido {
    private String horarioEntrega;

    public PedidoAgendado(String nomeCliente, String item, double valor, String horarioEntrega) {
        super(nomeCliente, item, valor);
        this.horarioEntrega = horarioEntrega;
    }

    public void  confirmarAgendamento(){
        System.out.println("Entrega agendada para às " + horarioEntrega + "!");
    }

}
