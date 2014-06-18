package uebung08;

import javax.swing.JOptionPane;

public class Vokalzaehler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String w = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		String s = w.toLowerCase();
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				a++;
			}
		}
		System.out.println("Das Wort " + "\"" + w + "\"" + " hat " + a + " Vokale.");
	}

}
