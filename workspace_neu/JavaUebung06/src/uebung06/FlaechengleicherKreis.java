package uebung06;

import javax.swing.JOptionPane;

public class FlaechengleicherKreis {

	public static void main(String[] args) {
		double laenge = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Länge des Rechtecks ein: "));
		double breite = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Breite des Rechtecks ein: "));
		Rechteck re = new Rechteck(laenge, breite);
		Kreis kr = new Kreis();
		kr.setFlaeche(re.getFlaeche());
		System.out.println("Rechtecklänge: " + re.getLaenge());
		System.out.println("Rechteckbreite: " + re.getBreite());
		System.out.println("Rechteckfläche: " + re.getFlaeche());
		System.out.println();
		System.out.println("Kreisradius: " + kr.getRadius());
		System.out.println("Kreisfläche: " + kr.getFlaeche());
	}

}
