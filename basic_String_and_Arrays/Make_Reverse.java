package basic_String_and_Arrays;

import java.util.Scanner;

public class Make_Reverse {
       
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = scn.nextInt();
		makeReverse(n);
	}
	public static int numberofDigits(int num) {
		int nod = 0;
		while (num != 0) {
			num = num / 10;
			nod++;
		}
		return nod;
	}
	public static int makeReverse(int num) {
		int rev = 0;
		int i =1;
		int nod = numberofDigits(num);	
		while(num!=0) {
	   
		
		int rem =num%10;
		//System.out.println(nod);
		
		rev += rem * (int)Math.pow(10, (nod-i));
		//System.out.println(rev);
		num = num/10;
		i++;
	}
		System.out.println(rev);
		return rev;
   }
	}

