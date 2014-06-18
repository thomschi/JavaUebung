package uebung06;

import javax.swing.JOptionPane;

public class Kreistabelle {

	public static void main(String[] args) {
		double r = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie den Anfangsradius ein: "));
		double s = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie den Steigerungswert ein: "));
		System.out.println("Radius \t\t\t Umfang \t\t\t\t\t Fläche");
		for (int i = 0; i < 30; i++){
			Kreis circle = new Kreis(r);
			System.out.println(r + "\t\t\t" + circle.getUmfang() + "\t\t\t\t" + circle.getFlaeche());
			r += s;
		}
	}

}
