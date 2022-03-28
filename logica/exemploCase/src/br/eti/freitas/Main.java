package br.eti.freitas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoElogio;

        System.out.println("**** E L O G I A D O R ****");
        System.out.println("Tipos de elogio:\n\n\n\11\0-Elogio profissional\n\12\0-Elogio físcio\n\13\0-Elogio pessoal\n");
        System.out.println("Informe o tipo de elogio: ");
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
