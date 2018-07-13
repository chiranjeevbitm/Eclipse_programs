package arrays;

import java.util.Scanner;

public class Arrays_2D {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int[][] arr = new int[3][4];
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);
		// System.out.println(arr[2]);
		// System.out.println(arr);
		// System.out.println("row" + arr.length);
		// System.out.println("col" + arr.length);
		//

		// int[][] arr = takeinput();
		// display(arr);

//		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 120, 130, 140, 150 },
//				{ 160, 170, 180, 190, 200 } };
//		spiralDisplayAntiClockWise(arr);

		// waveDisplayRightToLeft(arr);

		//
		 //int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }
		// };
		// spiralDisplayAntiClockWise(arr);

	//	 int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };
		//int[][] two = { { 7, 8, 9, 10 }, { 11, 12, 13, 14 }, { 15, 16, 17, 18 } };
		 
		 int[][] one = {{3,-5,4}};
		 int[][] two = {{1},{2},{5}};
		 display(matrixMul(two,one));

	}

	public static int[][] takeinput() {
		System.out.println("Rows ?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {

			System.out.println("Col for " + row + "th row ?");
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("{" + row + "," + col + "} ?");
				arr[row][col] = scn.nextInt();

			}

		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void waveDisplayTopToBottom(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {

				for (int row = 0; row < arr.length; row++) {

					System.out.print(arr[row][col] + " ");
				}

			} else {
				for (int row = arr.length - 1; row > -1; row--) {

					System.out.print(arr[row][col] + " ");
				}

			}
		}

		}

	public static void waveDisplayRightToLeft(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {

				for (int col = 0; col < arr[0].length; col++) {

					System.out.print(arr[row][col] + " ");
				}

			} else {
				for (int col = arr[0].length - 1; col > -1; col--) {

					System.out.print(arr[row][col] + " ");
				}

			}

		}

	}

	public static void spiralDisplayAntiClockWise(int[][] arr) {

		int rowmin = 0;
		int colmin = 0;
		int rowmax = arr.length - 1;
		int colmax = arr[0].length - 1;
		while (colmin <= colmax && rowmin <= rowmax) {
			for (int row = rowmin; row <= rowmax && colmin <= colmax && rowmin <= rowmax; row++) {
				System.out.print(arr[row][colmin] + " ");

			}

			colmin++;
			for (int col = colmin; col <= colmax && colmin <= colmax && rowmin <= rowmax; col++) {
				System.out.print(arr[rowmax][col] + " ");

			}
			rowmax--;

			for (int row = rowmax; row >= rowmin && colmin <= colmax && rowmin <= rowmax; row--) {
				System.out.print(arr[row][colmax] + " ");

			}

			colmax--;
			for (int col = colmax; col >= colmin && colmin <= colmax && rowmin <= rowmax; col--) {
				System.out.print(arr[rowmin][col] + " ");

			}
			rowmin++;
		}
	}

	/// need to solve again.......
	public static void spiralDisplayClockWise(int[][] arr) {

		int rowmin = 0;
		int colmin = 0;
		int rowmax = arr[0].length - 1;
		int colmax = arr.length - 1;
		while (colmin <= colmax && rowmin <= rowmax) {
			for (int col = colmin; col <= colmax; col++) {
				System.out.print(arr[col][rowmin] + " ");

			}

			rowmin++;
			for (int row = rowmax; row >= rowmin; row--) {
				System.out.print(arr[colmax][row] + " ");

			}
			colmax--;

			for (int col = colmax; col >= colmin; col--) {
				System.out.print(arr[rowmax][col] + " ");
			}

			rowmax--;
			for (int row = rowmin; row < rowmax; row++) {
				System.out.print(arr[row][colmin] + " ");

			}
			colmin++;
		}
	}

	/////

	public static int[][] matrixMul(int[][] one, int[][] two) {
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;

		if (r2 != c1) {
			return null;
		}
		int[][] ans = new int[r1][c2];

		int cd = r2;
		for (int row = 0; row < ans.length; row++) {

			for (int col = 0; col < ans[0].length; col++) {

				int sum = 0;
				for (int i = 0; i < cd; i++) {
					sum = sum + one[row][i] * two[i][col];
				}
				ans[row][col] = sum;
			}

		}
		return ans;
	}

}
