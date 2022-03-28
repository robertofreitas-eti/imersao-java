package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float valorCompra;
        String metodoPagamento;
        float valorDesconto;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("+-------------------------------------------------");
            System.out.println(" Métodos de Pagamento\n");
            System.out.println(" PIX. Pagamento com PIX (10% de desconto)");
            System.out.println(" Débito. Pagamento com cartão de débito");
            System.out.println(" Crédito. Pagamento com cartão de crédito");
            System.out.println(" STOP. Finalizar");
            System.out.println(" ");

            System.out.print(" Informe o valor da compra: ");
            valorCompra = sc.nextFloat();

            System.out.print(" Informe o método de pagamento: ");
            metodoPagamento = sc.next();

            if (metodoPagamento.equalsIgnoreCase("PIX")) {
                valorDesconto = ((valorCompra * 10) / 100) * -1;
            } else if (metodoPagamento.equalsIgnoreCase("DÉBITO") || metodoPagamento.equalsIgnoreCase("DEBITO")) {
                valorDesconto = 0;
            } else if (metodoPagamento.equalsIgnoreCase("CRÉDITO") || metodoPagamento.equalsIgnoreCase("CREDITO")) {
                valorDesconto = ((valorCompra * 5) / 100);
            } else if (metodoPagamento.equalsIgnoreCase("STOP")){
                System.out.println(" Processo terminado!");
                break;
            } else {
                System.out.println(" Você deve escolher um método de pagamento válido");
                valorDesconto = 0;
            }

            if (valorCompra > 0)  {
                System.out.println("=============================================");
                System.out.println(" Valor da compra....: " + valorCompra );
                System.out.println(" Desconto/Acrescimo.: " + valorDesconto );
                System.out.println(" Valor final........: " + (valorCompra + valorDesconto)+ "\n\n\n");
            }

        } while (!metodoPagamento.equalsIgnoreCase("STOP"));
        System.out.flush();
        sc.close();
    }
}
