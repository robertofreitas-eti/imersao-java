package br.eti.freitas.aula08.implementacao;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExecutarRelogioPonto {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Map<String, Date> controleAcesso = new HashMap<String, Date>();
		System.out.println("> Controle de acesso iniciado... ");

		JTextField entradaSaida = new JTextField(1);
		JTextField crachaAcesso = new JTextField(15);

		JPanel frame = new JPanel();
		JPanel panel = new JPanel();
		frame.setSize(380, 320);

		frame.add(panel);
		frame.setLayout(new FlowLayout());
		frame.add(new JLabel("Informe <E>ntrada, <S>aída ou Sai<R>"));
		frame.add(entradaSaida);
		frame.add(new JLabel("Crachá"));
		frame.add(crachaAcesso);

		int result = JOptionPane.OK_OPTION;
		
		while (result != JOptionPane.CANCEL_OPTION) {

			result = JOptionPane.showConfirmDialog(null, frame, "Dados do Livro", JOptionPane.OK_CANCEL_OPTION);

			if (result == JOptionPane.OK_OPTION) {
				if (entradaSaida.getText().equalsIgnoreCase("e") || entradaSaida.getText().equalsIgnoreCase("s")) {

					if (entradaSaida.getText().equalsIgnoreCase("e")) {

						if (!controleAcesso.containsKey(crachaAcesso.getText())) {
							Date dataAcesso = new Date();
							controleAcesso.put(crachaAcesso.getText(), dataAcesso );
							System.out.println("Entrada registrada [" + crachaAcesso.getText() + " - " + sdf.format(dataAcesso) + "]");
						} else {
							JOptionPane.showInternalMessageDialog(null, "Entrada já registrada!");
						}
					} else if (entradaSaida.getText().equalsIgnoreCase("S")) {
						if (controleAcesso.containsKey(crachaAcesso.getText())) {
							controleAcesso.remove(crachaAcesso.getText());
							JOptionPane.showInternalMessageDialog(null, "Obrigado pela visita");
						} else {
							JOptionPane.showInternalMessageDialog(null,
									"Saida não autorizada!\nEntrada não registrada!");
						}
					}
					System.out.println(controleAcesso);
				} else if (entradaSaida.getText().equalsIgnoreCase("r")) {
					System.out.println("> Controle de acesso finalizado... ");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
			}

		}

	}

}
