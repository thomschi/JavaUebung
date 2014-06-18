package uebung08;

import javax.swing.JOptionPane;

public class Stringrueckwaerts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		for (int i = s.length()-1; i >= 0; i-- ) {
			System.out.print(s.charAt(i));
		}
	}

}
