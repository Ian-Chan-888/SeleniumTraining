package Practice;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int n = reader.nextInt();

		int result = n;
		for (int i = n; i > 1; i--) {
			result = result * (i - 1);
		}
		System.out.println("The Factorial is: " + result);

	}

}
