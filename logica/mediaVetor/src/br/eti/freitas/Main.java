package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notaAluno[] = new double[5];
        double mediaClasse, somaNota = 0;

        System.out.println("+------------------------------------------------------------------+");
        System.out.println("| EXERCICIOS - Trabalhando com vetores                             |");
        System.out.println("+------------------------------------------------------------------+");

        for (int i=0; i<=4; i++) {
            System.out.print("Digite a nota do " + (i+1) + " aluno: " );
            notaAluno[i] = sc.nextDouble();
            somaNota += notaAluno[i];
        }
        sc.close();

        for (int i=0; i<=4; i++) {
            System.out.println("A nota do aluno " + (i+1) + " é: " +notaAluno[i]);
        }

        mediaClasse = somaNota / 5;
        System.out.println("A média da classe e: " + String.format("%.2f",mediaClasse));

    }
}
