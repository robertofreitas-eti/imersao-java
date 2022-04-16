package br.eti.freitas;

/**
 * Imersão Java - Uso e manipulação de vetores
 *
 * @author Roberto Freitas
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("AULA 06 - EXERCÍCIO 01 / ROBERTO");
        System.out.println("-------------------------------------------");

        int[] vetorA = new int[3];
        int[] vetorB = new int[3];
        int[] vetorC = new int[6];

        // Carregando VetorA
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = i;
        }
        // Apresentando VetorA
        System.out.print("Valor de A: " );
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + ",");
        }
        System.out.println("");

        // Carregando VetorB
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = i +3;
        }
        // Apresentando VetorB
        System.out.print("Valor de B: " );
        for (int i=0; i<vetorB.length; i++) {
            System.out.print(vetorB[i] + ",");
        }
        System.out.println("");

        // Carregando VetorC
        for (int i=0; i<vetorC.length; i++) {
                vetorC[i] =  i<3 ? vetorA[i] : vetorB[i-3];
        }
        // Apresentando VetorC
        System.out.print("Valor de B: " );
        for (int i=0; i<6; i++) {
            System.out.print(vetorC[i] + ",");
        }
    }
}
