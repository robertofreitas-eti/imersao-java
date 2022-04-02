package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, maior = -9999, menor = 9999, i = 1;
        float somatoria = 0, media;

        while (i <= 10) {
            System.out.print("Digite o " + i + " * número: ");
            numero = sc.nextInt();
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            somatoria += numero;
            i++;
        }
        sc.close();
        media = somatoria / 4;

        System.out.println("O maior número é: " + maior +
                           "\nO menor número é: " + menor +
                           "\nA média dos valores digitados é: " + media);

    }
}
