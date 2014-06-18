package uebung08;

import javax.swing.JOptionPane;

public class Stringrueckwaerts2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		StringBuffer r = new StringBuffer(s.length());
		for (int i = s.length()-1; i >= 0; i-- ) {
			r.append(s.charAt(i));
		}
		JOptionPane.showMessageDialog(null, r);
	}

}
