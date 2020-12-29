package deneme1;

import java.util.*;

public class FindingPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Set<Integer> primeNumbers = new TreeSet();

		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		

		if (number <= 0) {
			System.out.println("Invalid number!");
			System.exit(1);
		}

		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		
		System.out.println("There are " + primeNumbers.size() + " prime numbers within 1-" + number);
		System.out.println(primeNumbers);

	}

	public static boolean isPrime(int number) {
		Set<Integer> divisors = new HashSet<>();

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisors.add(number / i);
			}
		}

		return divisors.size() == 2;
	}

}
