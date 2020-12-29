package deneme1;

public class main {

	public static void main(String[] args) {

		System.out.println(isPalindrome("gkujhk"));

	}

	public static boolean isPalindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
//			i = 0 
//			i = 1

		}

		return true;

	}

}
