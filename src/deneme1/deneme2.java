package deneme1;

public class deneme2 {
	
	public static void main(String[] args) {
//		
//		double pow = Math.log10(7);
//		
//		System.out.println(Math.pow(2, 3));
//		
//		
//		
//		double x = 10.56;
//		
//		
//		int y = (int)x;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		double num1 = 12;
		double num2 = 14;
		
		System.out.println(math(num1, num2));
		math2(num1, num2);
		
		
		
	}
	
	public static double math(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static void math2(double num1, double num2) {
		System.out.println(Math.pow(num1, num2));
	}
	
	

}
