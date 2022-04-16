package br.eti.freitas;

import java.util.Scanner;

/**
 * Esta classe tem como objetivo o estudo de funções/métodos através da criação de uma
 * calculadora com operações básicas.
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor1 = 0, valor2=0;

        int opcao = 0;
        while (opcao!=6) {
            exibirMenu();
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    System.out.print("\nDigite o 1º valor:");
                    valor1 = sc.nextDouble();
                    System.out.print("\nDigite o 2º valor:");
                    valor2 = sc.nextDouble();
                    System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
                    break;
                case 2:
                    somar(valor1, valor2);
                    break;
                case 3:
                    subtrair(valor1, valor2);
                    break;
                case 4:
                    dividir(valor1, valor2);
                    break;
                case 5:
                    multiplicar(valor1, valor2);
                    break;
                case 6:
                    System.out.println("Saindo do sistema");
                    break;
            }
        }
    }

    /**
     * Exibir menu de opções da caluladora
     */
    public static void exibirMenu() {
        System.out.println("PROGRAMA CALCULADORA\n" +
                           "--------------------");
        System.out.println("Escolha sua opção!");
        System.out.println("1 - Digitar valores");
        System.out.println("2 - Realizar soma");
        System.out.println("3 - Realizar subtração");
        System.out.println("4 - Realizar divisão");
        System.out.println("5 - Realizar multiplicação");
        System.out.println("6 - Sair");
    }

    /**
     * Exibir resultado da operação
     *
     * @param resultado Resultado da operação realizada
     */
    public static void exibirResultado(double resultado) {
        System.out.println("O resultado da operação foi: " + resultado + "!");
    }

    /**
     * Efetua a operação de SOMA
     *
     * @param primeiroValor Primeiro valor
     * @param segundoValor Segundo valor
     */
     public static void somar(double primeiroValor, double segundoValor) {
         System.out.println("\n\nRealizando a soma entre " + primeiroValor + " e " + segundoValor);
         double resultado  = primeiroValor + segundoValor;
         exibirResultado(resultado);
     }

    /**
     * Efetua a operação de SUBTRAÇÃO
     *
     * @param primeiroValor Primeiro valor
     * @param segundoValor Segundo valor
     */
    public static void subtrair(double primeiroValor, double segundoValor) {
        System.out.println("\n\nRealizando a substração entre " + primeiroValor + " e " + segundoValor);
        double resultado  = primeiroValor - segundoValor;
        exibirResultado(resultado);
    }

    /**
     * Efetua a operação de DIVISÃO
     *
     * @param primeiroValor Primeiro valor
     * @param segundoValor Segundo valor
     */
    public static void dividir(double primeiroValor, double segundoValor) {
        System.out.println("\n\nRealizando a divisão entre "  + primeiroValor + " e " + segundoValor);
        double resultado  = primeiroValor / segundoValor;
        exibirResultado(resultado);
    }

    /**
     * Efetua a operação de MULTIPLICAÇÃO
     *
     * @param primeiroValor Primeiro valor
     * @param segundoValor Segundo valor
     */
    public static void multiplicar(double primeiroValor, double segundoValor) {
        System.out.println("\n\nRealizando a multiplicação entre "  + primeiroValor + " e " + segundoValor);
        double resultado  = primeiroValor * segundoValor;
        exibirResultado(resultado);
    }

}
