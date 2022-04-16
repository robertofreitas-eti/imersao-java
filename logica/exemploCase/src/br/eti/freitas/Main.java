package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Uso do switch case
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoElogio;

        System.out.println("**** E L O G I A D O R ****");
        System.out.println("Tipos de elogio:\n\n1-Elogio profissional\n2-Elogio físcio\n3-Elogio pessoal\n");
        System.out.print("Informe o tipo de elogio: ");
        tipoElogio = sc.nextInt();
        switch (tipoElogio) {
            case 1:
                System.out.println("Você é um profissional muito competente!");
                break;
            case 2:
                System.out.println("Você é uma pessoa muito forte!");
                break;
            case 3:
                System.out.println("Você é uma pessoa muito altruista!");
                break;
            default:
                System.out.println("Opção inválida");
        }
        sc.close();
    }
}
