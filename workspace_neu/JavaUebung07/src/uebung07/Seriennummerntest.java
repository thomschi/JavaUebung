package uebung07;

public class Seriennummerntest {

	public static void main(String[] args) {
		Bruch_mit_Seriennummer a = new Bruch_mit_Seriennummer(1,2);
		Bruch_mit_Seriennummer b = new Bruch_mit_Seriennummer(1,4);
		Bruch_mit_Seriennummer c = new Bruch_mit_Seriennummer(1,8);
		Bruch_mit_Seriennummer d = new Bruch_mit_Seriennummer(1,16);
		Bruch_mit_Seriennummer e = new Bruch_mit_Seriennummer(1,32);
		System.out.println(a.bruchtoString() + "\tSeriennummer: " + a.getSeriennummer());
		System.out.println(b.bruchtoString() + "\tSeriennummer: " + b.getSeriennummer());
		System.out.println(c.bruchtoString() + "\tSeriennummer: " + c.getSeriennummer());
		System.out.println(d.bruchtoString() + "\tSeriennummer: " + d.getSeriennummer());
		System.out.println(e.bruchtoString() + "\tSeriennummer: " + e.getSeriennummer());
	}

}
