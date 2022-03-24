package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float valorDoado, valorInvestimento;

        System.out.print("Informe o valor da doação: ");
        valorDoado = sc.nextFloat();

        if (valorDoado <= 1000) {
            valorInvestimento = (float) (valorDoado * 0.05);
        } else {
            valorInvestimento = (float) (valorDoado * 0.15);
        }
        System.out.println("O valor do investimento é de  R$: " + valorInvestimento);
    }
}
