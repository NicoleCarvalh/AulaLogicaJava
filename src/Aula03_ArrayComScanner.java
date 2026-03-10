import java.util.Scanner;

public class Aula03_ArrayComScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pessoasComMaisAuraNoSenai = new String[5];

        System.out.println("Digite o nome de pessoas com mais AURA!");

        for(int i = 0; i < pessoasComMaisAuraNoSenai.length; i++){
            System.out.println("Digite a pessoa " + (i + 1));
            pessoasComMaisAuraNoSenai[i] = sc.nextLine();
        }

        System.out.println("Pessoas com mais AURA no SENAI");
        for (int i = 0; i < pessoasComMaisAuraNoSenai.length; i++){
            System.out.println(i + 1 + ". " + pessoasComMaisAuraNoSenai[i]);
        }

        sc.close();
    }
}
