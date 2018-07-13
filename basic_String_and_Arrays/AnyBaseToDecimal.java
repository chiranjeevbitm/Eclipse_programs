package basic_String_and_Arrays;

import java.util.Scanner;
public class AnyBaseToDecimal {

	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num = scn.nextInt();
		int sb = scn.nextInt();
		int power = 1;
		int ans = 0;
		while (num != 0) {
			int rem = num % 10;
			ans = ans + (rem * power);

			power = power * sb;
			num = num / 10;
		}
		System.out.println(ans);
	}
}
