package Aula03;

import POO.Aluno;

public class Aula04_AprovacaoAluno {
    public static void main(String[] args) {
        double [] notas = {6, 7, 8};

        Aluno aluno = new Aluno("Nicole", 25, notas);

        aluno.mostrarDados();

        aluno.mostrarAprovacao();
    }
}
