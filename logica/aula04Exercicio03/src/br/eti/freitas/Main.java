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

        int num1, num2, resp = 0;
        int i = 1;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        sc.close();
        while (i <= num1) {
            resp += num2;
            i++;
        }
        System.out.println("Multiplicação: " + resp);
    }
}
