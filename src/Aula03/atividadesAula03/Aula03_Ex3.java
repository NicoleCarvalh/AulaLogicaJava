package Aula03.atividadesAula03;

public class Aula03_Ex3 {
    public static void main(String[] args) {
        int [] numeros = {1, 4, 3, 2, 5};

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
        }
        System.out.println(" ");
        for (int i = numeros.length-1; i >= 0; i--){
            System.out.print(numeros[i]);
        }
    }
}
