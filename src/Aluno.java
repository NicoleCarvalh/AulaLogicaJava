public class Aluno {
    String nome;
    int idade;
    private double[] notas = new double[3];

    public Aluno(String nome, int idade, double[]  notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public void mostrarDados(){
        System.out.println("Aluno: ");
        System.out.println(nome);

        System.out.println("Idade: ");
        System.out.println(idade);

        System.out.println("Média: ");
        System.out.println(media());
    }

    public double media(){
        return (notas[0] + notas[1] + notas[2])/3;
    }

    public void mostrarAprovacao(){
        if (media() > 6){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
