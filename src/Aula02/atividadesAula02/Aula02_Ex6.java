package Aula02.atividadesAula02;

import java.util.Scanner;

public class Aula02_Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int contagemDia = 1;
        String nomeVendedor = "";
        double valorVendidoVendedor;
        double totalGeralVendasEquipe = 0;


        do {
            for (int contagemVendedor = 1; contagemVendedor <= 5; contagemVendedor++){
                switch (contagemVendedor){
                    case 1:
                        nomeVendedor = "Julia";
                        break;
                    case 2:
                        nomeVendedor = "Cláudio";
                        break;
                    case 3:
                        nomeVendedor = "Fernanda";
                        break;
                    case 4:
                        nomeVendedor = "Márcio";
                        break;
                    case 5:
                        nomeVendedor = "René";
                        break;
                    default:
                        nomeVendedor = "Vendedor";
                        break;
                }

                System.out.println(" ----------VENDAS DIA " + contagemDia + "----------");
                System.out.println("Insira o valor vendido pelo vendedor(a) " + contagemVendedor + " - " + nomeVendedor);
                valorVendidoVendedor = sc.nextDouble();

                totalGeralVendasEquipe += valorVendidoVendedor;

                if (totalGeralVendasEquipe >= 1000){
                    System.out.println("A meta de R$1000 foi atingida por " + nomeVendedor);
                    System.out.println("Com a compra no valor de " + valorVendidoVendedor);
                    System.out.println("Total de vendas realizadas pela equipe é de " + totalGeralVendasEquipe);

                    break;
                }
            }

            contagemDia++;

        } while(totalGeralVendasEquipe < 1000 && contagemDia <= 6);

        if (totalGeralVendasEquipe < 1000){
            System.out.println("Meta de R$1000 não foi atingida.");
            System.out.println(" Total acumulado: " + totalGeralVendasEquipe);
        }

        sc.close();
    }
}
