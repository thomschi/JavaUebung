package uebung08;

import javax.swing.JOptionPane;

public class Stringsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		String s2 = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		String s3 = JOptionPane.showInputDialog("Bitte ein Wort eingeben: ");
		String sa = s1, sb = s1, sc = s1;
		if (s1.compareTo(s2) <= 0) {
			sa = s1;
			sb = s2;
		} else {
			sa = s2;
			sb = s1;
		}
		if (sa.compareTo(s3) >= 0) {
			sc = sb;
			sb = sa;
			sa = s3;
		} else if (sb.compareTo(s3) >= 0) {
			sc = sb;
			sb = s3;
		} else if (sb.compareTo(s3) < 0) {
			sc = s3;
		}
		System.out.println(sa);
		System.out.println(sb);
		System.out.println(sc);
	}
}
