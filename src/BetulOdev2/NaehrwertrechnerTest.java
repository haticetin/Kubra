package BetulOdev2;

public class NaehrwertrechnerTest {

	public static void main(String[] args) {

		Nahrungsmittel nutella = new Nahrungsmittel("Nutella", 533, 31, 55.9, 0.1016);
		Nahrungsmittel joghurt = new Nahrungsmittel("Joghurt", 27, 1.5, 3.7, 0.1245);
		Nahrungsmittel milch = new Nahrungsmittel("Milch", 92, 1.5, 4.9, 0.13);
		
		System.out.println(nutella);
		System.out.println(joghurt);
		System.out.println(milch);
		
		Person betul = new Person("Betul");
		betul.konsumiere(joghurt, 89);
		Person yusuf = new Person("Yusuf");
		yusuf.konsumiere(milch, 300);
		System.out.println(betul);
		System.out.println(yusuf);
		betul.konsumiere(nutella, 120);
		System.out.println(betul);

		
	}

}
