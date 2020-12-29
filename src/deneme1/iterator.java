package deneme1;

import java.util.*;

public class iterator {
	
	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Orange", "Pear", "Peach", "Banana", "Grapes", "Mandarin", 
				"Plum", "Apricot", "Fig", "Strawberry", "Sour Cherry", "Cherry", "Blueberry", "Mulberry",
				"Loquat"};
		
		
		
		for(Iterator<String> it = Arrays.asList(fruits).iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		
		
	}

}
