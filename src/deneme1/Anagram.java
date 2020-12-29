package deneme1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Astronomer ";
		String str2 = "Moon starer";
		
		System.out.println(isAnagram(str1, str2));

	}
	
	public static boolean isAnagram(String str1, String str2) {
		
		str1 = str1.replace(" ", "").toLowerCase();
		str2 = str2.replace(" ", "").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		boolean[] hasChars = new boolean[str1.length()];
		boolean[] allTrue = new boolean[str1.length()];
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					hasChars[i] = true;
				}
			}
			allTrue[i] = true;
		}
		
		return Arrays.equals(hasChars, allTrue);
		
	}

}
