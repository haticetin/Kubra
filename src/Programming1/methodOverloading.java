package Programming1;

public class methodOverloading {

	

	public static void main(String... args) {

		System.out.println("Varargs");
		System.out.println(method(5));
	}
	
	public static int method(int s) {
		return s*s;
	}
}
