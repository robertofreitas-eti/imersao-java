package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        System.out.println("Hello World!!!");
        System.out.println("Por favor, digite seu nome :");
        nome=leitor.next();
        System.out.println("O nome digitado foi: " +nome);
        leitor.close();
    }
}
