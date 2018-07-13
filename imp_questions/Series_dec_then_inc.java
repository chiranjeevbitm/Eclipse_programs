package imp_questions;

import java.util.Scanner;

public class Series_dec_then_inc {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		boolean ans  = dec_then_inc(n);
System.out.println(ans);
	}

	public static boolean dec_then_inc(int n) {

		int prev = scn.nextInt();
		int count = 1;
		boolean inc = false;
		while (count < n) {
		//	count++;
			int current = scn.nextInt();
			if (current > prev) {
				inc = true;

			}
			// prev=current;
			if (inc) {

				if (current < prev) {
					//System.out.println("false values ");
					// break;
				
					return false;
				}

			}
prev = current;
			count++;
		}
		// System.out.println("true values");
		return true;
	}

}
