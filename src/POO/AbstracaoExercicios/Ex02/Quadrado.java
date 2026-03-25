package POO.AbstracaoExercicios.Ex02;

public class Quadrado implements Desenhavel{

    @Override
    public void desenhar() {
        for(int r = 0; r < 7; r++){
            for(int c = 0; c < 7; c++){
                if(r == 0 || c == 0 || r == 6 || c == 6){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }


}
