import java.util.Scanner;

public class Aula01_Introducao {
    public static void main(String[] args) {
        // Cria um objeto para utilizar o scanner
        Scanner scanner = new Scanner(System.in);


        // Saída
        System.out.println("Hello, World!");


        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Você digitou " + nome);


    }
}
