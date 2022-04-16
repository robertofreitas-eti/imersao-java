package br.eti.freitas;

import java.util.Scanner;

/**
 * Exercicio para demonstrar a utilização de funçã/método COM parametros
 * O cálculo é efetuado através da função chamada caclulaReajuste que recebe 2 parametros
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA PARA AJUSTE DE SALÁRIO\n" +
                "----------------------------------");
        System.out.print("Informe o salário: ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Informe o percentual de reajuste: ");
        double indiceReajuste = sc.nextDouble();

        calculaReajuste(salarioAtual, indiceReajuste);

    }

    /**
     * Função/Método utilizado para calcular o reajuste com base nos valores fornecidos
     *
     * @param salarioAtual Recebe o salário atual
     * @param indiceReajuste Recebe o percentual de reajuste
     */
    public static void calculaReajuste(double salarioAtual, double indiceReajuste) {
        System.out.println("O salário após reajuste é de: " + String.format("%.2f",(salarioAtual + ((salarioAtual * indiceReajuste) / 100))) );
    }
}

