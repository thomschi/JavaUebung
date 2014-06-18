package uebung07;

public class Bruch {
	private int zaehler;
	private int nenner;
	
	Bruch() {
		setZaehler(0);
		setNenner(1);
	}
	
	Bruch(int x) {
		setZaehler(x);
		setNenner(1);
	}
	
	Bruch(int x, int y) {
		setZaehler(x);
		setNenner(y);
	}

	int getZaehler() {
		return zaehler;
	}

	void setZaehler(int z) {
		zaehler = z;
	}

	int getNenner() {
		return nenner;
	}

	void setNenner(int n) {
		nenner = n;
	}
	
	void ausgeben() {
		System.out.print(zaehler + "/" + nenner);
	}
	
	String bruchtoString() {
		return zaehler + "/" + nenner;
	}
	
	void kuerzen() {
		int m,n,r;	//lokale Variablen
		m = zaehler;
		n = nenner;
		r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		zaehler /= n; //in n steht jetzt der ggT
		nenner /= n;
	}
	
	void gekuerztausgeben() {
		kuerzen();
		ausgeben();
	}
	
	boolean equals(Bruch x) {
		Bruch a = new Bruch(this.zaehler, this.nenner);
		Bruch b = new Bruch(x.zaehler, x.nenner);
		a.kuerzen();
		b.kuerzen();
		if ((a.zaehler == b.zaehler) && (a.nenner == b.nenner)) {
			return true;
		} else {
			return false;
		}
	}
	
	Bruch addiere(Bruch b) {
		Bruch a = new Bruch((this.zaehler * b.nenner + b.zaehler * this.nenner),(this.nenner * b.nenner));
		a.kuerzen();
		return a;
	}
	
	Bruch subtrahiere(Bruch b) {
		Bruch a = new Bruch((this.zaehler * b.nenner - b.zaehler * this.nenner),(this.nenner * b.nenner));
		a.kuerzen();
		return a;
	}
	
	double dezimalwert() {
		double dw = (double)this.zaehler/this.nenner;
		return dw;
	}

}
