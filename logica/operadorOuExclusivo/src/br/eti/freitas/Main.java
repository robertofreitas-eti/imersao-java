package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double unidade, temperatura;

        System.out.print("Por favor, informe a unidade relativa do ar: ");
        unidade = sc.nextDouble();

        System.out.print("Por favor, insira a temperatura em graus celsius: ");
        temperatura = sc.nextDouble();

        /**
         * Neste caso é necessário ter pelo menos uma das condições verdadeira
         * e outra falsa, caso as duas seja falsa ou as duas verdadeiras será
         * considerado falso
         */
        if (unidade > 70 ^ temperatura > 26.00) {
            System.out.println("Resultado = Verdadeiro");
            System.out.println("Este resultado foi alcançado pois 1 dos 2 testes foi verdadeiro!");
        } else {
            System.out.println("Resultado = Falso");
            System.out.println("Este resultado foi alcançado pos os 2 testes ou falharam ou foram verdadeiros.");
        }
        sc.close();
    }
}
