package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Uso de função com retorno
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdeProdutos;

        System.out.println("SIMULADOR DE LOJA VIRTUAL\n-----------------------------------\n");
        System.out.print("Entre com a quantidade de produtos no carrinho: ");
        qtdeProdutos=sc.nextInt();
        double[] produtos=new double[qtdeProdutos];
        for(int i=0;i< produtos.length;i++){
            System.out.print("Digite o valor do produto: ");
            produtos[i]=sc.nextDouble();
        }

        System.out.println("Valor final da venda: R$ " + somarCarrinho(produtos));
    }

    /**
     * Método para simular a soma de itens de um carrinho de compras
     *
     * @param produtos array de produtos
     * @return soma dos itens no carrinho
     */
    public static double somarCarrinho(double[] produtos) {
        double totalProduto = 0;
        double totalComDesconto;

        for(int i=0; i<produtos.length;i++) {
            totalProduto = totalProduto + produtos[i];
        }

        if (totalProduto > 500) {
            totalComDesconto = totalProduto-(totalProduto * 0.1);
            return totalComDesconto;
        }

        return totalProduto;
    }
}
