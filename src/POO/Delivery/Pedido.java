package POO.Delivery;

public class Pedido {
    String nomeCliente;
    String item;
    double valor;

    public void exibirPedido(){
        System.out.println("Nome cliente: " + nomeCliente);
        System.out.println("Item: " + item);
        System.out.println("Valor: " + valor);
    }
}
