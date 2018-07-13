package basic_String_and_Arrays;

import java.util.Scanner;

public class DecimalToAnyBase {
       public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int decimal = scn.nextInt();
		int db = scn.nextInt();
		int power = 1;
		int ans = 0;
		
		while(decimal !=0) {
			int rem = decimal % db;
			ans = ans + (rem * power);
			
			power = power * 10;
			decimal = decimal/db;
			
		}
		System.out.println(ans);
	}
}
