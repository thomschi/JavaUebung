package uebung07;

public class Bruch_mit_Seriennummer extends Bruch {
	static int anzahl = 0;
	private final int seriennummer;
	
	Bruch_mit_Seriennummer(int x, int y) {
		super(x,y);
		anzahl++;
		seriennummer = anzahl;
	}
	
	Bruch_mit_Seriennummer() {
		this(0, 1);
	}
	 Bruch_mit_Seriennummer(int x) {
		 this(x, 1);
	 }
	 
	 int getSeriennummer() {
		 return seriennummer;
	 }
}
