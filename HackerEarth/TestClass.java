package HackerEarth;

import java.util.Scanner;

public class TestClass {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		PrintPrime(1, 9);
	}

	public static boolean IsPrime(int num) {
		// num = scn.nextInt();
		int div = 2;
		boolean flag = true;
		while (div * div <= num) {
			if (num % div == 0) {
				flag = false;
				break;
			}
			div++;
		}
		if (flag) {
			return true;
		} else {
			return false;
		}

	}

	public static void PrintPrime(int lowerlimit, int num) {
		// int num = scn.nextInt();
		lowerlimit = 2;

		for (int counter = lowerlimit; counter <= num; counter++) {
			boolean rv = IsPrime(counter);
			if (rv) {
				System.out.print(counter + " ");
			}
		}

	}

}