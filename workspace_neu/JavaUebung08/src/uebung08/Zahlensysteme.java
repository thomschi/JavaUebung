package uebung08;

import javax.swing.JOptionPane;

public class Zahlensysteme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int z = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine ganze Zahl ein: "));
		JOptionPane.showMessageDialog(null,"Dezimalzahl: " + z + "\n" + "als Binärzahl: " + Integer.toBinaryString(z) + "\n" + "als Oktalzahl: " + Integer.toOctalString(z) + "\n" + "als Hexadezimalzahl: " + Integer.toHexString(z).toUpperCase());
	}
}
