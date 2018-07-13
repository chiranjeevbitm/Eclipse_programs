package TimeComplexity;

import java.util.Arrays;

public class DynamicProgramming {

	public static void main(String[] args) {
		// // System.out.println(GetpolynomialVal(3, 3));
		// // System.out.println(GetpolynomialValRec(3, 3, 3));
		// printPrimeNormal(100);
		// printPrimeSOE(100);
		 System.out.println(countPalindromeSSBetter("abbaba"));
		int n = 40;
		// System.out.println(fibbtr1(n, new int[n+1]));
		// System.out.println(countBoardPaths(0,30));
		// System.out.println(countBoardPathsbtr(0, n,new int[n+1] ));
		// System.out.println(Countmazepathbtr(0, 0,n,n,new int[n+1][n+1]));

		// System.out.println(fibbtrItersmall(n));
		// System.out.println(countBoardPathsItr(n));
		//System.out.println(countBoardPathsItr(n));
	}

	public static int GetpolynomialVal(int x, int n) {
		int co = n;
		int pow = x;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + co * pow;
			co--;
			pow = pow * x;
		}
		return sum;
	}

	public static int GetpolynomialValRec(int pow, int x, int n) {
		if (n == 0) {
			return 0;
		}

		int thisTerm = pow * n;

		int nextTerm = GetpolynomialValRec(pow * x, x, n - 1);

		return thisTerm + nextTerm;
	}

	public static void printPrimeNormal(int n) {
		for (int n2check = 2; n2check <= n; n2check++) {
			int div = 2;
			boolean flag = true;
			while (div * div <= n2check) {
				if (n2check % div == 0) {
					flag = false;
					break;
				}
				div++;
			}

			if (flag) {
				System.out.println(n2check);
			}
		}

	}

	public static void printPrimeSOE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = false;

		primes[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (primes[i] == false) {
				continue;
			}
			for (int mult = 2; i * mult <= n; mult++) {
				primes[i * mult] = false;
			}
		}
		for (int i = 0; i <= n; i++) {
			if (primes[i] == true) {
				System.out.print(i);
			}
		}
	}

	public static int countPalindromeSSBetter(String str) {
		int count = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; (axis - orbit) >= 0 && (axis + orbit) < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;

				} else {
					break;
				}

			}
		}
		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; (axis - orbit) >= 0 && (axis + orbit) < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;

				} else {
					break;
				}

			}
		}
		return count;
	}

	public static int fibbtr1(int n, int[] strg) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (strg[n] != 0) {
			return strg[n];
		}

		int fibnm1 = fibbtr1(n - 1, strg);
		int fibnm2 = fibbtr1(n - 2, strg);
		int fibn = fibnm1 + fibnm2;
		strg[n] = fibn;
		return fibn;

	}

	public static int fibbtrIterative(int n) { // fastest fibb
		int[] strg = new int[n + 1];
		// init
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i + 1];
		}
		return strg[n];
	}

	public static int fibbtrItersmall(int n) { // fastest fibb
		int[] strg = new int[2];
		// init
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 1; i < n - 1; i++) {
			int nv = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = nv;
		}
		return strg[1];
	}

	public static int countBoardPaths(int curr, int end) {
		if (curr > end) {
			return 0;

		}
		if (curr == end) {
			return 1;

		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			int cdice = countBoardPaths(curr + dice, end);
			count += cdice;

		}
		return count;
	}

	public static int countBoardPathsItr(int n) {
		int[] strg = new int[n + 6];
		strg[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}
		return strg[0];
	}

	public static int countBoardPathsItrSmal(int n) {
		int[] strg = new int[6];
		strg[0] = 1;
		for (int slide = 1; slide <= n; slide++) {
			int nv = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = nv;
		}
		return strg[0];
	}

	public static int countBoardPathsbtr(int curr, int end, int[] strg) {
		if (curr > end) {
			return 0;

		}
		if (curr == end) {
			return 1;

		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		// int cdice =0;
		for (int dice = 1; dice <= 6; dice++) {
			int cdice = countBoardPathsbtr(curr + dice, end, strg);
			count += cdice;

		}
		strg[curr] = count;
		return count;

	}

	public static int Countmazepath(int scol, int srow, int ecol, int erow, String ans) {

		// bases case
		if (scol == ecol && srow == erow) {

			System.out.println(ans);

			return 1;

		}

		if (scol > ecol || srow > erow) {
			// System.out.println(ans);

			return 0;
		}
		int r1 = Countmazepath(scol + 1, srow, ecol, erow, ans + "V");
		int r2 = Countmazepath(scol, srow + 1, ecol, erow, ans + "H");
		return r1 + r2;

	}

	public static int Countmazepathbtr(int scol, int srow, int ecol, int erow, int[][] strg) {

		// bases case
		if (scol == ecol && srow == erow) {
			return 1;
		}

		if (scol > ecol || srow > erow) {
			return 0;
		}
		if (strg[srow][scol] != 0) {
			return strg[srow][scol];
		}
		int r1 = Countmazepathbtr(scol + 1, srow, ecol, erow, strg);
		int r2 = Countmazepathbtr(scol, srow + 1, ecol, erow, strg);
		int count = r1 + r2;
		strg[srow][scol] = count;
		return count;
	}

}
