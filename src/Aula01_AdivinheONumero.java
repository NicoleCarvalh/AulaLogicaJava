import java.util.Random;
import java.util.Scanner;

public class Aula01_AdivinheONumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado = random.nextInt(1,11);

        System.out.println("Adivinhe o número (1 a 10)");
        int palpite = sc.nextInt();

        if(palpite == numeroSorteado){
            System.out.println("Parabéns");
        } else {
            System.out.println("Errou! o número era: " + numeroSorteado);
        }

        sc.close();
    }
}
