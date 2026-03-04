package atividadesAula02;

public class Aula02_Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++){

            if(i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
