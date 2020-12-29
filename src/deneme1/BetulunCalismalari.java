package deneme1;

import java.util.Random;

public class BetulunCalismalari {

	public static void main(String[] args) {
		
		Random rm = new Random();
		
		int randomNum = rm.nextInt(100-1)+1;
		
		double random = Math.round(((Math.random()*100-1)+1)*100.0)/100.0;
		
		System.out.println(randomNum);
		System.out.println(random);	
		
		long num = 745_843;
		System.out.println(num);
		
		
		
		
		

	}

}
