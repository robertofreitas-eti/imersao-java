package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Montando um histograma de pagamento de parcelas
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //--------------
        int parcelasPagas = 0, parcelasAntecipadas = 0 ;
        String[] histograma = new String[121];
        System.out.print("Quantas parcelas foram pagas? ");
        parcelasPagas = sc.nextInt();

        System.out.print("Quantas parcelas foram antecipadas? ");
        parcelasAntecipadas = sc.nextInt();

        sc.close();

        for (int i=0; i<parcelasPagas; i++) {
            histograma[i] = "P";
        }

        for (int i=parcelasAntecipadas; i>0; i--) {
            histograma[histograma.length-i] = "A";
        }

        // monta dezenas
        for (int i=0; i<=10; i++) {
            System.out.print(i<9 ? "          " + (i+1) : "         " + (i+1));
        }
        System.out.println("");

        // monta numeral das dezenas
        for (int i=0; i<=10; i++) {
            for (int x=0; x <= 9; x++) {
                System.out.print(x+1);
            }
        }
        System.out.println("");

        for (int i=0; i<= histograma.length-1; i++) {
            System.out.print("-");
        }

        // imprime parcelas
        System.out.println("");
        for (int i=0; i < histograma.length; i++) {
            System.out.print(histograma[i] != null ? histograma[i] : " ");
        }
    }
}
