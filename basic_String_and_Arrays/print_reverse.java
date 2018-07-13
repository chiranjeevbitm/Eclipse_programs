package basic_String_and_Arrays;

import java.util.Scanner;

public class print_reverse {
	
		public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = scn.nextInt();
		while(n!=0)
		{
		  int a = n % 10;
			 n = n/10;
			 System.out.print(a);
			 
		}
	
		

}
}
