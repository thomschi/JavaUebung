package uebung07;

public class Kontotest {

	public static void main(String[] args) {
		Konto MeinKonto = new Konto("0000000001", 1000.00);
		System.out.println("Kontonummer:" + MeinKonto.getKontonummer());
		System.out.println("Kontostand: " + MeinKonto.getKontostand());
		MeinKonto.einzahlen(500.00);
		MeinKonto.auszahlen(750.50);
		System.out.println();
		System.out.println("Kontonummer:" + MeinKonto.getKontonummer());
		System.out.println("Kontostand: " + MeinKonto.getKontostand());
		
		
	}

}
