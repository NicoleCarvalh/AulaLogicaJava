package POO.Empresa;

public class Funcionario {
    private String nome; // Encapsulamento
    private String cpf; // Encapsulamento
    private double salarioBase; // Encapsulamento

    public Funcionario(){

    }

    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public void apresentar(){
        System.out.println("Funcionário: " + nome + " | CPF: "+ cpf + " | Salário: " + getSalarioBase());
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
}
