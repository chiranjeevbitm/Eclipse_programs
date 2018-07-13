package basic_String_and_Arrays;

import java.util.Scanner;

// make functions for 1 prime
//2 Armstrong and its parts
//3 log
//4 power
public class functions {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// int ll = scn.nextInt();
		// int ul = scn.nextInt();
		// System.out.println("Enter no and Base");
		// int num = scn.nextInt();
		// int base = scn.nextInt();
		// log(num, base);
		// int k = scn.nextInt();

		// printAllPrimes(ll,ul);
		// printArmstrong(0, 1000);
		// makeReverse(num);

//		System.out.println("Enter no and power");
//		int num = scn.nextInt();
//		int p = scn.nextInt();
//		power(num, p);
		
		
		System.out.println("Enter a number");
		int num = scn.nextInt();
		System.out.println("Factorial is");
		factorial(num);
		
		
	}

	public static void printAllPrimes(int ll, int ul) {
		for (int counter = ll; counter <= ul; counter++) {
			boolean rv = isPrime(counter);
			if (rv)
				System.out.println(counter);
		}
	}

	public static boolean isPrime(int num) {

		int div = 2;
		boolean flag = true;
		while (div <= num - 1) {
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

	public static int numberofDigits(int num) {
		int nod = 0;
		while (num != 0) {
			num = num / 10;
			nod++;
		}
		return nod;
	}

	public static boolean isArmstrong(int num, int nod) {
		int temp = num;
		int ans = 0;
		while (num != 0) {
			int rem = num % 10;
			ans = ans + (int) Math.pow(rem, nod);
			num = num / 10;
		}
		if (ans == temp)
			return true;
		else
			return false;
	}

	public static void printArmstrong(int ll, int ul) {
		for (int counter = ll; counter <= ul; counter++) {
			boolean rv = isArmstrong(counter, numberofDigits(counter));
			if (rv)
				System.out.println(counter);
		}
	}

	public static int makeReverse(int num) {
		int rev = 0;
		int i = 1;
		int nod = numberofDigits(num);
		while (num != 0) {

			int rem = num % 10;
			// System.out.println(nod);

			rev += rem * (int) Math.pow(10, (nod - i));
			// System.out.println(rev);
			num = num / 10;
			i++;
		}
		System.out.println(rev);
		return rev;
	}
	
	public static void fibbonaci_no(int n) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number upto which you want a fibbonaci");
		 n = scn.nextInt();
		int a =0;
		int b =1;
		int counter =0;
		while(counter<=n) {
		System.out.print(a + " ");
		int sum = (a+b);
		a = b;
		b = sum;
		counter++;
		
		}



	}

	public static int rotation(int num, int k) {
		int result = 0;
		int nod = numberofDigits(num);
		// if k exceeds nod
		if (k > nod)
			k = k % nod;

		// if k is negative
		if (k < 0)
			k = k + nod;

		System.out.println(nod);
		int part1 = num % ((int) Math.pow(10, k));
		System.out.println(part1);
		int part2 = num / (int) Math.pow(10, (k));
		System.out.println(part2);
		result = part1 * (int) Math.pow(10, (nod - k)) + part2;

		System.out.println(result);

		return result;

	}

	// This will give the integer part not the fractional
	public static int log(int num, int base) {
		int counter = 0;
		while (num != 0) {
			num = num / base;
			counter++;
		}

		System.out.println(counter - 1);
		return counter - 1;
	}

	public static int power(int num, int p) {
		int result = 1;
		while (p != 0) {
			result = result * num;
			p--;
		}
		System.out.println(result);
		return result;
	}
	public static long factorial(int num) {
		long result =  1;
		while(num!=0) {
			result = result*(result-1);
		}
		System.out.println(result);
		return result;
	}
}
