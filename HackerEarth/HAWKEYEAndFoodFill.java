package HackerEarth;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class HAWKEYEAndFoodFill {

	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long x = scn.nextLong();
		long y = scn.nextLong();
		long p = scn.nextLong();

		// BufferedReader br = new BufferedReader(
		// new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		// long n = Integer.parseInt(st.nextToken());
		// long x =Integer.parseInt(st.nextToken());
		// long y =Integer.parseInt(st.nextToken());
		// long p=Integer.parseInt(st.nextToken());

		long dist;
		long[][] arr = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist = Math.max(Math.abs(x - i), Math.abs(y - j));
				if (dist >= p)
					arr[i][j] = 0;
				else
					arr[i][j] = p - dist;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
