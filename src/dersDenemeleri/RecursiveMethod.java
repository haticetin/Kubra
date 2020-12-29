package dersDenemeleri;

public class RecursiveMethod {

	public static int fact(int n) {
				
		if (n <= 1)
			return 1;
		else {
			System.out.println(n * fact(n - 1));
			return n * fact(n - 1);
		}
		
//		3 * fact(2)
//			2 * fact(1)
//					1
	}

	public static void main(String args[]) {
		System.out.println("The factorial of 6 is: " + fact(3));
		System.out.println("The factorial of 0 is: " + fact(0));
	}
}
