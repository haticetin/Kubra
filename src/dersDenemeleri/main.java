package dersDenemeleri;

import java.util.*;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number: ");
		scan.useLocale(Locale.US);
		double number = scan.nextDouble();
		number *= 0.02547;
		System.out.println("Number : " + number);

		Locale.setDefault(Locale.US);
	}
}
