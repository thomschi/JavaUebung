package uebung08;

public class StringBuffertest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer Puffer = new StringBuffer();
		System.out.println("Puffergröße: " + Puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + Puffer.length());
		System.out.println(Puffer);
		Puffer.append("Drei Chinesen");
		System.out.println("Puffergröße: " + Puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + Puffer.length());
		System.out.println(Puffer);
		Puffer.setCharAt(2, 'i');
		Puffer.setCharAt(9, 'i');
		Puffer.setCharAt(11, 'i');
		System.out.println(Puffer);
		Puffer.delete(0, Puffer.length());
		System.out.println(Puffer);
		System.out.println("Puffergröße: " + Puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + Puffer.length());
		Puffer.append("Drei Chinesen");
		Puffer.append(" mit dem Kontrabass");
		System.out.println(Puffer);
		System.out.println("Puffergröße: " + Puffer.capacity());
		System.out.println("Länge des Pufferinhalts: " + Puffer.length());
	}

}
