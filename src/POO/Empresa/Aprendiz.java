package POO.Empresa;

public class Aprendiz extends Funcionario{
    private int cargaHoraria;

    public Aprendiz(String nome, String cpf, double salarioBase, int cargaHoraria) {
        super(nome, cpf, salarioBase); // chama o construtor da classe mãe
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("É um aprendiz que faz " + cargaHoraria + "h por dia");
    }
}
