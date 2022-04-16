package br.eti.freitas;
/**
 * Imersão Java - Uso de arrays multidimensionais
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("AULA 06 - EXERCÍCIO 02 / ROBERTO");
        System.out.println("-------------------------------------------");

        int[][] valores = new int[2][3];
        int somaPares = 0;

        valores[0][0] = 2;
        valores[0][1] = 3;
        valores[0][2] = 4;
        valores[1][0] = 6;
        valores[1][1] = 7;
        valores[1][2] = 1;

        for (int l=0; l<2; l++) {
            for (int c=0; c<3; c++) {
                System.out.println("Linha[" + l + "] Coluna[" + c + "] = " + valores[l][c]);

                somaPares += (valores[l][c] % 2) == 0 ? valores[l][c] : 0;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
    }
}
