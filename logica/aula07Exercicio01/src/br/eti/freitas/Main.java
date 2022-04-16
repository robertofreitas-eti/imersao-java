package br.eti.freitas;

import java.util.Scanner;

/**
 * Exercicio para demonstrar a utilização de função SEM parametros
 * O cálculo é efetuado através da função chamada caclulaReajuste através do uso
 * de vairáveis declaradas como globais
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static double salarioAtual, indiceReajuste;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA PARA AJUSTE DE SALÁRIO\n" +
                           "----------------------------------");
        System.out.print("Informe o salário: ");
        salarioAtual = sc.nextDouble();

        System.out.print("Informe o percentual de reajuste: ");
        indiceReajuste = sc.nextDouble();

        calculaReajuste();

    }

    /**
     * Função/Método utilizado para calcular o reajuste
     */
    public static void calculaReajuste() {
        System.out.println("O salário após reajuste é de: " + ( salarioAtual + ((salarioAtual * indiceReajuste) / 100)) );
    }

}
