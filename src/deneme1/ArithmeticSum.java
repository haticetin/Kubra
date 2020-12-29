package deneme1;

public class ArithmeticSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 99; i++) {
			sum += i;
		}

		System.out.println("Sum = " + sum);

		System.out.println("Sum = " + gaussWay(1, 99));

	}

	public static int gaussWay(int begin, int end) {

		if (end % 2 != 0) {
			return (end * (end/2)) + end;
		}

		return (begin + end) * (end / 2);
	}

}
