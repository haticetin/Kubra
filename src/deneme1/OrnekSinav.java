package deneme1;

public class OrnekSinav {

	public static void main(String[] args) {

		System.out.println(intToBase2(18));
		System.out.println(intToBase2(72));
		System.out.println(intToBase2(-12));
	}

	public static String intToBase2(int number) {

		String str = "";

		int divided = number;

		if (number < 0) {
			divided = number * (-1);
		}

		for (int i = divided; i >= 1; i = divided) {
			str += String.valueOf(i % 2);
			divided = i / 2;
		}

		String binRep = "";

		if (number < 0) {
			binRep += "-";
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			binRep += str.charAt(i);
		}

		return binRep;
	}

}
