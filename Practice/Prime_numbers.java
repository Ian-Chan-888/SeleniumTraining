package Practice;

public class Prime_numbers {

	static void checkPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) { // No Remainder = 0; else = 1
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

	public static void main(String args[]) {
		int n = 1000;
		for (int i = n; i > 1; i--) {
			checkPrime(i);
		}

	}

}

/*
 * A prime number is a whole number greater than 1 whose only factors are 1 and
 * itself. A factor is a whole numbers that can be divided evenly into another
 * number.
 */
