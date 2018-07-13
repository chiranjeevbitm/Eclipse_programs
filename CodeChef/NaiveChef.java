package CodeChef;

import java.util.Scanner;

public class NaiveChef {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			double counta = 0;
			double countb = 0;
			double n = scn.nextInt();
			double a = scn.nextInt();
			double b = scn.nextInt();
			int[] x = new int[(int) n];

			for (int j = 0; j < n; j++) {
				x[j] = scn.nextInt();
			}
			for (int j = 0; j < n; j++) {
				if (x[j] == a) {
					counta++;
				
					int m = 0;
					while (m != n) {
						if (x[m] == b) {
							countb++;
						}
						m++;
					}
				}
			}

			//System.out.println(counta);
			//System.out.println(countb);
			if (a == b && counta == n) {
				System.out.println(1.0000000);
			} else {
				double rv = (countb / (n * n));
				System.out.printf("%.7f\n", rv);
			}

		}
	}

}
