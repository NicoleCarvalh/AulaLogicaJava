public class Aula02_ForAninhado {
    public static void main(String[] args) {
        for(int r = 1; r <= 5; r++){ //row
            for(int c = 1; c <= r; c++){ //col
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
