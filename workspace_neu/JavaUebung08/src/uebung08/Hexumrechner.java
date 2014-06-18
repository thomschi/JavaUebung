package uebung08;

import javax.swing.JOptionPane;

public class Hexumrechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Bitte geben Sie eine Hexadezimalzahl ein: ");
		int z = Integer.valueOf(s, 16);
		JOptionPane.showMessageDialog(null,"eingegebene Hexzahl: " + s.toUpperCase() + "\n"  + "als Dezimalzahl: " + z + "\n" + "als Binärzahl: " + Integer.toBinaryString(z));
	}
}
