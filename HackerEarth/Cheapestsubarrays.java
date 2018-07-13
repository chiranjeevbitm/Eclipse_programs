package HackerEarth;

import java.util.*;

public class Cheapestsubarrays {

	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scn.nextInt();
			int size = n * (n - 1) / 2;
			int[] sum = new int[n - 1];
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {

				arr[i] = scn.nextInt();

			}
			for(int i=0;i<n-1;i++) {
				 sum[i]= arr[i]+arr[i+1];
			}

			Arrays.sort(sum);

			System.out.println(sum[0]);
		}

	}
}
