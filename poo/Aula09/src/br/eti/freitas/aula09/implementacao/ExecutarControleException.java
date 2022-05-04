package br.eti.freitas.aula09.implementacao;

import javax.swing.JOptionPane;

import br.eti.freitas.aula09.excecao.ControleException;

public class ExecutarControleException {

	public static void main(String[] args) throws ControleException {

		try {
			int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1:"));
			int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2:"));

			JOptionPane.showMessageDialog(null, "Resultado: " + (vl1 / vl2));

		} catch (ArithmeticException ex) {
			JOptionPane.showMessageDialog(null, "Estamos com instabilidade..");
			throw new ControleException("LOG", ex);
			
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Estamos com instabilidade..");
			throw new ControleException("EMAIL", ex);

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Operação Invalida");
			throw new ControleException("ERRO", ex);
		}

	}

}
