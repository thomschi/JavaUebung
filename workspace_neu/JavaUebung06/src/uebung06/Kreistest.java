package uebung06;

import javax.swing.JOptionPane;

public class Kreistest {

	public static void main(String[] args) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie den Radius des Kreises ein: "));
		Kreis circle = new Kreis(radius);
		System.out.println("Radius: " + circle.getRadius());
		System.out.println("Umfang: " + circle.getUmfang());
		System.out.println("Fläche: " + circle.getFlaeche());
	}

}
