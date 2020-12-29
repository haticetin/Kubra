package BetulOdev2;

public class Nahrungsmittel {

	String name;
	double energie;
	double fett;
	double zucker;
	double salz;

	public Nahrungsmittel(String name, double energie, double fett, double zucker, double salz) {
		this.name = name;
		this.energie = energie;
		this.fett = fett;
		this.zucker = zucker;
		this.salz = salz;
	}

	public String lebensmittelampelFett() {

		return fett < 3 ? "grün" : fett >= 3 && fett <= 17 ? "gelb" : "rot";
	}

	public String lebensmittelampelZucker() {

		return zucker < 5 ? "grün" : zucker >= 5 && zucker <= 22.5 ? "gelb" : "rot";
	}

	public String lebensmittelampelSalz() {

		return salz < 0.3 ? "grün" : salz >= 0.3 && salz <= 1.5 ? "gelb" : "rot";
	}

	public String toString() {
		return name + " - Energie: " + energie + " kcal, Fett: " + fett + "g (" + lebensmittelampelFett()
				+ "), Zucker: " + zucker + "g (" + lebensmittelampelZucker() + "), Salz: " + salz + "g ("
				+ lebensmittelampelSalz() + ")";
	}

}
