package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double valorCompra, valorTotal;
        String codigoCupom;

        System.out.println("SISTEMA DE DESCONTOS");
        System.out.println("====================");
        System.out.print("Informe o valor da compra: ");
        valorCompra = sc.nextDouble();
        System.out.print("Informe o código do cupom: ");
        codigoCupom = sc.next();

        if (valorCompra > 1000.00 || codigoCupom.equalsIgnoreCase("DESCONTO20")) {
            valorTotal = valorCompra - ((valorCompra * 20) /100);
        } else {
            valorTotal = valorCompra;
        }
        System.out.println("Valor final da compra: " + valorTotal);
        sc.close();
    }
}
