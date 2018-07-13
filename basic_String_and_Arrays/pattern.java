package basic_String_and_Arrays;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//int num = scn.nextInt();
		// pattern1(num);
		// pattern2(num);
		// pattern5(num);
		pattern8_A2P10(5);
		// pattern7_A2P9(num);
		// pattern9_nCr(num);
	//fibonacci(10);;

	
	}

	public static void pattern1(int num) {

		int row = 1;

		int nsp = num - 1;
		int nst = 1;
		// loop for spaces
		while (row <= num) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// loop for stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;

			}
			// next row preparation
			nsp--;
			nst++;
			System.out.print("\n");
			row = row + 1;
		}
	}

	public static void pattern2(int num) {
		int row = 1;
		while (row <= num) {
			int col = 1;
			while (col <= num) {
				System.out.print("*");
				col++;
			}
			System.out.print("\n");
			row++;
		}

	}

	public static void pattern3(int num) {
		int nsp = 0;
		int nst = num;
		int row = 1;

		// loop for stars
		while (row <= num) {
			int cst = 1;

			while (cst <= nst) {

				System.out.print("*");
				cst++;
			}
			// loop for spaces
			int csp = 1;
			while (csp <= nst) {
				System.out.print(" ");
				csp++;
			}
			// next row preparation
			nst--;
			nsp++;
			System.out.print("\n");
			row += 1;
		}
	}

	public static void pattern4(int num) {
		int nsp = 1;
		int nst = num;
		int row = 1;

		// loop for stars
		while (row <= num) {
			int cst = 1;

			while (cst <= nst) {

				System.out.print("*");
				cst++;
			}
			// loop for spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// loop for stars
			cst = 1;
			while (cst <= nst) {

				System.out.print("*");
				cst++;
			}

			// next row preparation
			row += 1;
			nst--;
			nsp = 2 * row - 1;

			System.out.print("\n");

		}
	}

	public static void pattern5(int num) {
		int row = 1;
		int val = 1;
		while (row <= num) {
			int col = 1;
			while (col <= row) {
				System.out.print(val + " ");
				col++;
				val++;
			}
			System.out.print("\n");
			row++;
		}
	}

	public static void pattern6_A2P8(int num) {
		int row = 1;
		int val = 1;
		while (row <= num) {
			int col = 1;
			while (col <= row) {
				if (col == 1 || col == row) {
					System.out.print(val + " ");
				} else
					System.out.print("0 ");
				col++;
			}
			val++;
			System.out.print("\n");
			row++;

		}
	}

	public static int Calculate_nCr(int n, int r) {
		int y = n - r;
		int nfact = 1;
		int rfact = 1;
		int n_rfact = 1;

		while (n > 0) {
			nfact = nfact * (n);
			n--;

		}
		// System.out.println(nfact);
		while (r > 0) {
			rfact = rfact * (r);
			r--;

		}
		// System.out.println(rfact);

		while ((y) > 0) {
			n_rfact = n_rfact * (y);
			y--;

		}
		// System.out.println(n_rfact);
		int x = (rfact * n_rfact);
		int result = nfact / x;
		System.out.println(result);
		return result;

	}

	public static void pattern7_A2P9(int num) {
		int row = 1;
		int val = 1;
		int i = 0;
		while (row <= num) {
			int col = 1;
			while (col <= row) {
				if (col == 1 || col == row) {
					System.out.print(val + " ");
				} else {
					int p = Calculate_nCr(i + 1, i);
					System.out.print(p + " ");

					i++;

				}
				col++;
			}

			System.out.print("\n");
			row++;

		}
	}

	public static int fibbonaci_no(int n) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number upto which you want a fibbonaci");
		n = scn.nextInt();
		int a = 0;
		int b = 1;
		int counter = 0;
		while (counter <= n) {
			System.out.print(a + " ");
			int sum = (a + b);
			a = b;
			b = sum;
			counter++;

		}
		return a;

	}

	public static void pattern8_A2P10(int num) {

		int row = 1;
		int nstar = 1;
		int count = 0;
		while (row <= num) {
			for (int col =0; col < nstar; col++) {
				//System.out.print(fibonacci(count) + " ");
				fibonacci(count);
				count++;

			}
			row++;
		nstar++;
			System.out.println();

		}

	}

	public static void fibonacci(int num) {
		int a = 0;

		int b = 1;
		int count = 1;
		
		while (count <= num) {
		
			int sum = (a + b);
			a = b;
			b = sum;
			count++;
			
		}
		System.out.print(a + " ");
		//return count;
	}

	public static void pattern9_nCr(int num) {
		int row = 0;

		while (row <= num) {

			int val = 1;
			int col = 0;

			while (col <= row) {

				System.out.print(val + " ");
				col++;
				val = (val * (row - col + 1)) / (col);

			}
			row++;
			System.out.print("\n");

		}

	}

	public static void pattern10_q12(int num) {
		int row = 1;
		int nspace = 1;
		int nstar = num / 2 + 1;
		while (row <= num) {
			// star
			for (int i = 1; i <= nstar; i++) {
				System.out.print("*");
			}

			// space
			for (int i = 1; i <= nspace; i++) {
				System.out.print(" ");
			}

			// star
			for (int i = 1; i <=nstar ; i++) {
				System.out.print("*");
			}
			row++;
			if (row <= num / 2 + 1) {
				nspace = nspace + 2;
				nstar = nstar - 1;

			} else {
				nspace = nspace - 2;
				nstar = nstar + 1;
			}
			//row++;
			System.out.println();
		}
	}
}
