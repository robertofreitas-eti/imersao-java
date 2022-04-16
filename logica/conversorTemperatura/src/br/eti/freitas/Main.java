package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java
 *
 * Criar um método que possibilite o usuário informar:
 * - A temperatura, podendo ser em graus Celsius ou Fahrenheit
 * - Informar a escala da temperatura informada está
 * Criar um outro método que receba os 2 atributos e realizar a conversão de temperatora, quando o usuário informar
 * que a temperatura está em graus Celsius o método deve realizar a conversão para Fahrenheit, se informar Fahrenheit
 * converter para graus Celsius
 *
 * Considere usar:
 * - Desvios condicionais
 * - Validação de variáveis do tipo string com case sensitive
 * - Operações aritiméticas
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temperatura;
        String escala;

        System.out.print("CONVERSOR DE TEMPERATURA\n================================================\n\n");
        System.out.print("Tabela de Escalas:\nC = Celsius \nF = Fahrenheit \n\n");
        System.out.print("Por favor informe:\n\n");
        System.out.print("Temperatura: ");
        temperatura = sc.nextDouble();
        System.out.print("Escala: ");
        escala = sc.next();

        if (escala.equalsIgnoreCase("F") || escala.equalsIgnoreCase("C")) {
            System.out.println("A temperatura em " + escala + " " + converteTemperatura(temperatura, escala));
        } else {
            System.out.println("Escala inválida!");
        }
    }

    /**
     * Método utilizado para realizar a conversão da temperatura em Celsius ou Fahrenheit
     *
     * @param temperatura Informe a temperatura
     * @param escala Informe F para Fahrenheit ou C para Celsius
     * @return
     */
    public static double converteTemperatura(double temperatura, String escala) {
        double resultado;

        if (escala.equalsIgnoreCase("C")) {
            resultado = ((temperatura * 1.8) + 32);
            return resultado;
        } else {
            resultado = ((temperatura - 32) / 1.8);
            return resultado;
        }
    }
}
