package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Uso de desvios condicionais
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        if (idade >= 12) {
            System.out.print("Você está autorizado a jogar!");
        }
        sc.close();
    }
}
