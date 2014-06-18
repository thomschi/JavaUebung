package uebung07;

public class Girokonto extends Konto {
	private double Limit;

	double getLimit() {
		return Limit;
	}

	void setLimit(double limit) {
		Limit = limit;
	}
	
	Girokonto(String ktonr, double saldo, double dispo) {
		super(ktonr, saldo);
		setLimit(dispo);
	}
	
	void auszahlen(double auszahlung) {
		if (auszahlung > (getKontostand() + Limit)) {
			System.out.println("Fehler: Kreditlimit überschritten!");
		} else {
			super.auszahlen(auszahlung);
		}
	}
}
