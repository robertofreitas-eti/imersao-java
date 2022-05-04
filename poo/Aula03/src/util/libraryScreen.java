package util;

import javax.swing.JOptionPane;

/**
 * This example uses static methods to customize data entry from JOptionPane
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class libraryScreen {

	public static String text(String label) {
		return JOptionPane.showInputDialog(label);
	}
	
	public static int number(String label) {
		return Integer.parseInt(JOptionPane.showInputDialog(label));
	}
	
	public static Double decimal(String label) {
		return Double.parseDouble(JOptionPane.showInputDialog(label));
	}
	
	public static Boolean trueFalse(String label) {
		return JOptionPane.showConfirmDialog(null, label, "Question", JOptionPane.YES_NO_OPTION) == 0 ? true : false;
	}
	
	public static void show(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}
