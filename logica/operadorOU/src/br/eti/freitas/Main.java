package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java
 *
 * Criar um método que possibilite o usuário informar:
 * - Valor de uma compra
 * - Código do cupom de desconto
 * quando o for aplicado o código do cumpom "DESCONTO20" ou a compra for superior a 1.000,00
 * conceder o desconto de 20%
 *
 * Considere usar:
 * - Desvios condicionais;
 * - O operador lógico OU;
 * - Validação de variáveis do tipo string com case sensitive;
 * - Operadores aritiméticas;
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double valorCompra, valorDesconto;
        String codigoCupom;

        System.out.println("CARRINHO DE COMPRAS\n===============================================");
        System.out.print("Por favor, informe o : \n\n");
        System.out.print("Valor da compra: ");
        valorCompra = sc.nextDouble();
        System.out.print("Código do cupom: ");
        codigoCupom = sc.next();

        if (valorCompra > 1000.00 || codigoCupom.equalsIgnoreCase("DESCONTO20")) {
            valorDesconto = ((valorCompra * 20) /100);
        } else {
            valorDesconto = 0.00;
        }
        System.out.println("=======================================");
        if (valorDesconto > 0){
            System.out.println("Valor da compra.: " + valorCompra);
            System.out.println("Valor Desconto..: " + valorDesconto);
        }
        System.out.println("Valor Total.....: " + (valorCompra - valorDesconto));
        sc.close();
    }
}
