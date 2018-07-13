package basic_String_and_Arrays;

import java.util.Scanner;

public class fibbonaci_no {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number upto which you want a fibbonaci");
		int n = scn.nextInt();
		int a = 0;
		int b = 1;
		int counter = 0;
		while (counter <= n) {
			System.out.print(a + " ");
			int sum = (a + b);
			a = b;
			b = sum;
			counter++;

		}
	scn.close();
	}
}
