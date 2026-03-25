package Aula03;

import POO.ExemploGerais.ContaBancaria;

import java.util.Scanner;

public class Aula04_CaixaBancario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        System.out.println("==== SENAI PAY MASTER ====");
        System.out.println("Seja bem vindo! Digite o seu nome para começar");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(0, nome);

        while (opcao != 3){
            System.out.println("Digite a opção desejada");
            System.out.println("01 - Depositar");
            System.out.println("02 - Sacar");
            System.out.println("03 - Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Digite o valor");
                double valor = sc.nextDouble();
                conta.depositar(valor);
            }

            if(opcao == 2){
                System.out.println("Digite o valor para sacar");
                double valor = sc.nextDouble();
                conta.sacar(valor);
            }

            System.out.println("Saldo final " + conta.getSaldo());
        }

        sc.close();
    }
}
