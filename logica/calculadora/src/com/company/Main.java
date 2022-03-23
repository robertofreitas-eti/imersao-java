package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valor1, valor2, res;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Exibir a soma de 2 números");
        System.out.println("Digite o primeiro número ");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo número ");
        valor2 = leitor.nextInt();
        res=valor1 + valor2;
        System.out.println("O resultado da soma é: " + res);
    }
}
