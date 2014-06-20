package codeeval;

/**
 * CHALLENGE DESCRIPTION:
 * 
 * Write a program to determine the biggest prime palindrome under 1000.
 */

public class PrimePalindrone {
	static int largestPP;
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			if (isPrime(i)) {
				isPalindrone(i);
			}
		}
		System.out.println(largestPP);
	}

	static boolean isPrime(int num) {
		if (num <= 1) { return false; }
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void isPalindrone(int prime) {
		String test = Integer.toString(prime);
		
		if (test.length() == 1) {
			return;
		} else if (test.length() == 2) {
			if (test.charAt(0) == test.charAt(1)) {
				largestPP = prime;
			}
		} else {
			if (test.charAt(0) == (test.charAt(2))) {
				largestPP = prime;
			}
		}
	}
}
