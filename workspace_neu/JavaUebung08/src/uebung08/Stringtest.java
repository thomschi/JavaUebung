package uebung08;

import javax.swing.JOptionPane;

public class Stringtest {
	public static void main (String[] args) {
		String a = "Das ist ";
		String b = "eine Zeichenkette!";
		String c = a.concat(b);
		System.out.println(a.concat(b));
		System.out.println(c);
		System.out.println(c.length());
		System.out.println(a.compareTo(b));
		System.out.println(a.charAt(1));
		
		String vorname = JOptionPane.showInputDialog("Ihr Vorname: ");
		String nachname = JOptionPane.showInputDialog("Ihr Nachname: ");
		double alter = Double.parseDouble(JOptionPane.showInputDialog("Ihr Alter: "));
		String name = vorname + " " + nachname;
		System.out.println("Sie heißen " + name);
		System.out.println("Ihr Vorname besteht aus " + vorname.length() + " Zeichen");
		System.out.println("Ihr Nachname beginnt mit " + nachname.charAt(0));
		if ((alter-18) >= 0) {
			System.out.println("Sie sind seit " + String.valueOf(alter-18) + " Jahren volljährig!");
		} else {
			System.out.println("Sie werden in " + String.valueOf(18-alter) + " Jahren volljährig!");
		}
		
		if (vorname.compareTo(nachname) < 0) {
			System.out.println("Ihr Vorname ist lexikalisch vor dem Nachnamen einzusortieren!");
		} else if (vorname.compareTo(nachname) > 0) {
			System.out.println("Ihr Vorname ist lexikalisch hinter dem Nachnamen einzusortieren!");
		}else if (vorname.compareTo(nachname) == 0) {
			System.out.println("Ihr Vorname ist identisch mit dem Nachnamen!");
		}
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}
	
	
}
