package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Uso de loops
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeSalarios, i=1;
        float salario, maiorSalario = 0, menorSalario = 9999999;
        float mediaSalarial, somaSalarios = 0;

        System.out.print("Digite a quantidade de funcionarios na empresa: ");
        quantidadeSalarios = sc.nextInt();

        while (i <= quantidadeSalarios ) {
            System.out.print("Digite o salário do " + i + " * funcionario: ");
            salario = sc.nextFloat();

            if (salario < menorSalario) {
                menorSalario = salario;
            }
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            somaSalarios += salario;
            i++;
        }
        sc.close();

        mediaSalarial = somaSalarios / quantidadeSalarios;
        System.out.println("Maior salário: R$ " + maiorSalario +
                           "\nMenor salário: R$ " + menorSalario +
                           "\nMedia salarial: R$ " + mediaSalarial );

    }
}
