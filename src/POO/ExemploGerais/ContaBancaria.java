package POO.ExemploGerais;

public class ContaBancaria {

    // Atributos
    private String titular;
    private double saldo;

    public ContaBancaria(double saldo, String titular) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(){

    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saldo realizado com sucesso no valor de " + valor);
        } else {
            System.out.println("Valor insuficiente ou inválido");
        }

    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso no valor " + valor);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }
}
