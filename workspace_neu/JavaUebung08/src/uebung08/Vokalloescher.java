package uebung08;

import javax.swing.JOptionPane;

public class Vokalloescher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		StringBuffer sb = new StringBuffer(s.length());
		for (int i = 0; i < s.length(); i++) {
			if (s.toLowerCase().charAt(i) != 'a' & s.toLowerCase().charAt(i) != 'e' & s.toLowerCase().charAt(i) != 'i' & s.toLowerCase().charAt(i) != 'o' & s.toLowerCase().charAt(i) != 'u') {
				sb.append(s.charAt(i));
			}
		}
		s = sb.toString();
		JOptionPane.showMessageDialog(null, s);
	}
}
