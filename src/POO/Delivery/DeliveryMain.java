package POO.Delivery;

public class DeliveryMain {
    public static void main(String[] args) {
        PedidoFull pf = new PedidoFull("Claudio", "Pizza", 55, 20);
        pf.exibirPedido();
        pf.rastrear();

        PedidoAgendado pa = new PedidoAgendado("Flávio", "Bolo", 80, "19:00");
        pa.exibirPedido();
        pa.confirmarAgendamento();
    }
}
