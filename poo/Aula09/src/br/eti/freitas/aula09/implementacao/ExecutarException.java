package br.eti.freitas.aula09.implementacao;

import java.util.Scanner;

public class ExecutarException {

	public static void main (String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		try {
			int valor1;
			int valor2;
			
			System.out.print("Informe o valor 1: ");
			valor1 = sc.nextInt();

			System.out.print("Informe o valor 2: ");
			valor2 = sc.nextInt();
			
			System.out.println("Resultado: " + (valor1/valor2));
		} catch (ArithmeticException ex) {
			System.out.println("Erro de divisão por zero");
		} catch (Exception ex) {
			System.out.println("Erro: " + ex.getMessage());
			System.out.println("Erro: " + ex.getCause());
		}
		
	}
}
