package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Informe sua idade : ");
        idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Voto não permitido, embarque negado!");
        } else if (idade < 18 ) {
            System.out.println("Voto facultativo, embarque permitido!");
        } else {
            System.out.println("Voto obrigatório!");
        }
        sc.close();

    }
}
