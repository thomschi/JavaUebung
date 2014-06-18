package uebung08;

import javax.swing.JOptionPane;

public class Vokalzaehler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				a++;
			}
		}
		System.out.println("Das Wort " + "\"" + s + "\"" + " hat " + a + " kleine Vokale.");
	}

}
