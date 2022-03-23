package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Consumo de Combustível");
        System.out.print("Kilometragem Inicial: ");
        double kmInicial = sc.nextInt();

        System.out.print("Kilometragem Final: ");
        double kmFinal = sc.nextInt();

        System.out.print("Quantidade Litros: ");
        double litrosCombustivel = sc.nextInt();

        double consumoMedio = (kmFinal - kmInicial) / litrosCombustivel;

        System.out.println("O consumo médio de combustível é: " + consumoMedio );

        sc.close();

    }
}
