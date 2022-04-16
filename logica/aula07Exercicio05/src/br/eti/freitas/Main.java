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
        String opcao;

        do {
            System.out.println("MONITOR DE POLUIÇÃO\n------------------------------------");

            System.out.print("Informe o nível de poluição: ");
            double nivelPoluicao = sc.nextDouble();

            verificaNivelPoluicao(nivelPoluicao);

            System.out.print("Deseja encerrar a verificação (S/N)? ");
            opcao = sc.next();

        } while (opcao.equalsIgnoreCase("n"));
        sc.close();
    }

    /**
     * Função/Método responsável por avaliar o nível de poluição
     *
     * O indice de poluição aceitável varia entre 0,05 ~ 0,25
     * Quando o nível de poluição estiver em:
     *    >= 0,3 As empresas do GRUPO 1 devem suspender as atividades
     *    >= 0,4 As empresas do GRUPO 1 e 2 devem suspender as atividades
     *    >= 0,5 As empresas do GRUPO 1, 2 e 3 devem suspender as atividades
     */
    public static void verificaNivelPoluicao(double nivelPoluicao) {

        if (nivelPoluicao >= 0.05 && nivelPoluicao <= 0.25 ) {
            System.out.println("Nível de poluição dentro do tolerável!");
        } else if (nivelPoluicao >= 0.3 && nivelPoluicao < 0.4 ) {
            System.out.println("Empresas do GRUPO 1 devem suspender a produção!");
        } else if (nivelPoluicao >= 0.4 && nivelPoluicao < 0.5 ) {
            System.out.println("Empresas do GRUPO 1 e 2 devem suspender a produção!");
        } else if (nivelPoluicao >= 0.5 ) {
            System.out.println("Empresas do GRUPO 1, 2 e 3 devem suspender a produção!");
        } else {
            System.out.println("Nível de poluição não detectado!");
        }
    }

}
