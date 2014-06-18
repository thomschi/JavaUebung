package uebung06;

import javax.swing.JOptionPane;

public class Rechtecktest {

	public static void main(String[] args) {
		Rechteck testeck = new Rechteck();
		testeck.setLaenge(Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Länge des Rechtecks ein: ")));
		testeck.setBreite(Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein: ")));
		System.out.println("Lange Seite: " + testeck.getLangeSeite());
		System.out.println("Kurze Seite: " + testeck.getKurzeSeite());
		System.out.println("Diagonale: " + testeck.getDiagonale());
		System.out.println("Fläche: " + testeck.getFlaeche());
		System.out.println("Umfang: " + testeck.getUmfang());
		testeck.laengeAusgeben();
	}
}
