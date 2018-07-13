package HackerEarth;

import java.util.*;

public class theGraitKain {

	public static void main(String args[]) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		long sum1 = 0;
		long sum2 = 0;
		long sum3 = 0;

		for (int i = 0; i < n; i++) {
			a.add(i, scn.nextInt());
		}
		for (int i = 0; i < n; i = i + 3) {

			sum1 = sum1 + a.get(i);
		}
		for (int i = 1; i < n; i = i + 3) {

			sum2 = sum2 + a.get(i);
		}
		for (int i = 2; i < n; i = i + 3) {

			sum3 = sum3 + a.get(i);
		}
		System.out.print(sum1+" "+sum2+" "+sum3+" ");
		
	}

}
