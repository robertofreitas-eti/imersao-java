package br.eti.freitas.aula10.util;

import javax.swing.JOptionPane;

public class EntradaTela {

	public static String texto(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}

	public static double decimal(String mensagem) {
		return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
	}

	public static int inteiro(String mensagem) {
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	}

	public static boolean logico(String mensagem) {
		int resposta = JOptionPane.showConfirmDialog(null, mensagem, "Pergunta?", JOptionPane.YES_NO_OPTION,
				JOptionPane.YES_OPTION);
		if (resposta == 0) {
			return true;
		}
		return false;
	}

	public static void show(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
