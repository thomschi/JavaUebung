package uebung07;

public class Anteil extends Bruch {
	
	static Bruch verteilt = new Bruch(0);

	Anteil() {
		super();
	}

	Anteil(int x, int y) {
		super(x, y);
		verteilt = verteilt.addiere(this);
		if(verteilt.getZaehler() > verteilt.getNenner()) {
			System.out.println("Fehler: Es wurde zuviel verteilt!");
		}
	}
	
	Bruch getRest() {
		Bruch gesamt = new Bruch(1);
		return gesamt.subtrahiere(verteilt);
	}
	
}
