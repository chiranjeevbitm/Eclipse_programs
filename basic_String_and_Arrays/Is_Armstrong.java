package basic_String_and_Arrays;

import java.util.Scanner;
import java.lang.*;

public class Is_Armstrong {
	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	System.out.println("please enter a number to check Armstrong no");
	int n = scn.nextInt();
	int counter = 0;
	while(n!=0)
	{
		n=n/10;
		counter ++;
	}
	
	int no_of_digits = counter;
	//System.out.println(no_of_digits);
	int sum = 0;
	for(int i = 0; i< no_of_digits;i++)
	{
		int a = n % 10;
		 n = n/10;
		 System.out.println(a);
		int b = (int) Math.pow(a,no_of_digits);
		
		sum = sum + b;
	}
	System.out.println(sum);
	if(sum == n )
	{
		System.out.println("Armstrong no");
	}
	else
		System.out.println("not a armstrong no");
	
}
}
