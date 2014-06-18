package uebung07;

public class Konto {
	private String Kontonummer;
	private double Kontostand;

	public String getKontonummer() {
		return Kontonummer;
	}

	public void setKontonummer(String kontonummer) {
		Kontonummer = kontonummer;
	}

	public double getKontostand() {
		return Kontostand;
	}

	public void setKontostand(double kontostand) {
		Kontostand = kontostand;
	}
		
	Konto(String ktonr, double saldo){
		setKontonummer(ktonr);
		setKontostand(saldo);
	}

	void einzahlen(double einzahlung) {
		Kontostand += einzahlung;
	}
	
	void auszahlen(double auszahlung) {
		Kontostand -= auszahlung;
	}
	
}
