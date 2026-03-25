package POO.AbstracaoExercicios.Ex02;

public class Triangulo implements Desenhavel{

    @Override
    public void desenhar() {
        for(int r = 0; r < 7; r++){
            for(int c = 0; c < r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
