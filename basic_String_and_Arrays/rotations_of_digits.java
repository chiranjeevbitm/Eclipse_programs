package basic_String_and_Arrays;

import java.util.Scanner;

public class rotations_of_digits {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the number");
		int num = scn.nextInt();
		System.out.println("Enter the number of rotations");
		int k = scn.nextInt();
		rotation(num, k);
    }
		public static int numberofDigits(int num) {
			int nod = 0;
			while (num != 0) {
				num = num / 10;
				nod++;
			}
			return nod;
		}
		public static int rotation(int num , int k) {
			int result =0;
			int nod = numberofDigits(num);
			// if k exceeds nod 
			if(k>nod) k = k % nod;
			
			//if k is negative
			if(k<0) k = k +nod;
				
				System.out.println(nod);
				int part1 = num % ((int)Math.pow(10, k));
				System.out.println(part1);
				int part2 = num / (int)Math.pow(10, (k));
				System.out.println(part2);
				result = part1 * (int)Math.pow(10, (nod-k)) + part2 ;
			
			System.out.println(result);
			
			
			return result;
			
		}
		
}

