package basic_String_and_Arrays;

import java.util.Scanner;

public class IsPrime {
	
	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		boolean flag = false;
		int n = scn.nextInt();
		for(int i = 2; i < (n-1); i++)
		{
			if(n%i==0)
				flag = true;
			break;
			
		}
		if(flag == true)
			System.out.println("not prime");
		else
			System.out.println("prime");
			
	}
	

}
