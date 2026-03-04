package atividadesAula02;

import java.util.Scanner;
import java.lang.Math;

public class Aula02_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double somaIdadeJogadoresTime = 0;

        double somaAlturaJogadores = 0;

        int qtdJogadorMenorDeIdade = 0;

        int jogadoresMaisPesados = 0;

        int contagemDeJogadores = 0;

        int contagemDeTimesTotalAtual = 1;

        double mediaIdadesDoTime = 0;

        double mediaAlturaGeral = 0;

        double percentualPeso = 0;



        System.out.println("Qual a quantidade de times a ser inserida?");
        int contagemDeTime = sc.nextInt();

        for(int i = 1; i <= contagemDeTime; i++){
            System.out.println("Qual a quantidade de jogadores a ser inserida no time " + i + "?");
            int quantidadeDeJogadoresTime = sc.nextInt();

            somaIdadeJogadoresTime = 0;


            for(int j = 1; j <= quantidadeDeJogadoresTime; j++){
               System.out.println("Time atual " + contagemDeTimesTotalAtual);
               System.out.println("Digite a idade do jogador " + j);
               int idade = sc.nextInt();

               System.out.println("Digite o peso do jogador " + j);
               int peso = sc.nextInt();

               System.out.println("Digite a altura do jogador " + j + " em metros");
               double altura = sc.nextDouble();

               if(idade < 18){
                   qtdJogadorMenorDeIdade++;
               }

               if(peso >= 80){
                   jogadoresMaisPesados++;
               }

               System.out.println("----- Time " + contagemDeTimesTotalAtual + "---------");
               System.out.println("Jogador " + j + ":");
               System.out.println(" Idade: " + idade);
               System.out.println(" Peso (kg): " + peso);
               System.out.println(" Altura (cm): " + altura);

               somaIdadeJogadoresTime += idade;
               somaAlturaJogadores += altura;

               contagemDeJogadores++;

           }

           mediaIdadesDoTime = somaIdadeJogadoresTime/quantidadeDeJogadoresTime;
           System.out.println("A média das idades dos jogadores do time " + contagemDeTime + " é de " + mediaIdadesDoTime);
           contagemDeTimesTotalAtual++;

       }
        mediaAlturaGeral = somaAlturaJogadores/(contagemDeJogadores);
        percentualPeso = (double) (jogadoresMaisPesados * 100) /(contagemDeJogadores*contagemDeTime);


        System.out.println("-------- RESULTADOS --------");
        System.out.println("A quantidade de jogadores menores de idade é de " + qtdJogadorMenorDeIdade);
        System.out.println("A média das alturas de todos os jogadores do campeonato é de " + mediaAlturaGeral + "m");
        System.out.println("O percentual de jogadores com +80 quilos entre todo o campeonato é de " + percentualPeso + "%");
    }
}
