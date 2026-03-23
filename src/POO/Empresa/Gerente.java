package POO.Empresa;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase); // Chama construtor da classe mãe/pai
        this.bonus = bonus;
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() + bonus;
    }
}
