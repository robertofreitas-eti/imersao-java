package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salarioAtual, salarioNovo;
        String categoriaCargo;

        System.out.println("\nCALCULADORA DE DISSÍDIO\n");
        System.out.print("Informe seu salário: ");
        salarioAtual = sc.nextFloat();
        System.out.print("Informe a categoria de seu cargo: ");
        categoriaCargo = sc.next();
        sc.close();

        if (categoriaCargo.equalsIgnoreCase( "A")  ||
                categoriaCargo.equalsIgnoreCase( "c") ||
                    categoriaCargo.equalsIgnoreCase( "F") ||
                        categoriaCargo.equalsIgnoreCase( "H") ) {
            salarioNovo = ((float) (salarioAtual * 1.1));
        }
        else if (categoriaCargo.equalsIgnoreCase("b") ||
                    categoriaCargo.equalsIgnoreCase( "d") ||
                        categoriaCargo.equalsIgnoreCase( "t") ) {
            salarioNovo = (float) (salarioAtual *1.15);
        }
        else if (categoriaCargo.equalsIgnoreCase("K") ||
                    categoriaCargo.equalsIgnoreCase("R") ) {
            salarioNovo = (float) (salarioAtual *1.25);
        }
        else {
            salarioNovo = salarioAtual;
        }

        // Caso não haja alteração salarial, informar!
        if (salarioAtual != salarioNovo) {
            System.out.println("Seu novo salário é de: " + salarioNovo);
        } else {
            System.out.println("Não houve alteração salarial.");
        }

    }
}
