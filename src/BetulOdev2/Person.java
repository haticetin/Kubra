package BetulOdev2;

public class Person {

	String name;
	Nahrungsmittel nahrung;

	public Person(String name) {
		this.name = name;
	}

	public void konsumiere(Nahrungsmittel nahrung, double mengeInGramm) {
		this.nahrung = nahrung;
		this.nahrung.energie += ((this.nahrung.energie * (mengeInGramm / 100)) + mengeInGramm % 100);
	}

	public String toString() {
		return name + " - Aufgenommene Nährwerte - Energie: " + nahrung.energie + "kcal, Fett: " + nahrung.fett
				+ "g, Zucker: " + nahrung.zucker + "g, Salz: " + nahrung.salz + "g";
	}

}
