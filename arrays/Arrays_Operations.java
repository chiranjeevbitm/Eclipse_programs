package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Operations {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int[] arr = takeInput();
		// display(arr);

		// int[] arr = {100,20,30,900,80};
		// System.out.println("Array is");
		// display(arr);
		// System.out.println("Array after reverse");
		// reverse(arr);

		// display(arr);
		// System.out.println();
		// System.out.println("max " + max(arr));

		// System.out.println("find " + findLS(arr,30));

		// System.out.println("find " + findBS(arr,30));

		// int[] arr = {100,20,30,900,80};
		// reverse2(arr);
		// display(arr);
		//
		// int[] arr = {2,0,1,5,4,3};
		// System.out.println("Enter the no of rotations");
		// int k = scn.nextInt();
		// rotation(arr, k);

		// int[] arr = { 1, 2, 0, 4, 3 };
		// int[] ia = inverse(arr);
		// display(ia);
//
		int[] arr = { 1, 2, 3};
//		int target = scn.nextInt();
//		ArrayAssignP12(arr, target);
		//BinaryBaseToDecimal();
		subset(arr);

	}

	public static int[] takeInput() {
		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];
		int[] one = new int[n];
		int[] two = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + " th element");
			arr[i] = scn.nextInt();
			one[i] = scn.nextInt();
			two[i] = scn.nextInt();

		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		Arrays.sort(arr);
		// After sorting the array
		for (int val : arr) {
			 System.out.print(val + " ");
		}

	}

	public static int max(int[] arr) {
		int maxval = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxval) {
				maxval = arr[i];
			}
		}
		return maxval;
	}

	public static int findLS(int[] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				return i;
			}
		}

		return -1;
	}

	public static int findBS(int[] arr, int val) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (val > arr[mid]) {
				left = mid + 1;
			} else if (val < arr[mid]) {
				right = mid - 1;

			} else {
				return mid;
			}

		}
		return -1;

	}

	public static void swap(int[] one, int[] two) {
		System.out.println();
		int[] temp = one;
		one = two;
		two = temp;

	}

	public static void reverse(int[] arr) {
		for (int j = (arr.length) - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

	public static void reverse2(int[] arr) {
		for (int j = 0; j < (arr.length) / 2; j++) {
			int temp = arr[j];
			arr[j] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = temp;

		}

	}

	public static int[] inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			inv[arr[i]] = i;
		}
		return inv;
	}

	public static void rotation(int[] arr, int k) {

		// if k exceeds nod
		if (k > arr.length)
			k = k % (arr.length);

		// if k is negative
		if (k < 0)
			k = k + (arr.length);
		for (int i = arr.length - k; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void subset(int[] arr) {
		int limit  = (int)Math.pow(2, arr.length);
		int counter = 0;
		while(counter<limit) {
		int temp =counter;
		for (int i = 0; i < arr.length; i++) {
			int bit = temp%2;
			temp = temp/2;
			if(bit==1) {
				System.out.print( arr[i]+" ");
			}
		}
		System.out.println();
		counter++;
		}
	}

	public static void ArrayAssignP12(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j] + " ");
				}
			}

		}

	}
	public static void BinaryBaseToDecimal() {

		
			int num = scn.nextInt();
			int sb = 2;
			int power = 1;
			int ans = 0;
			while (num != 0) {
				int rem = num % 10;
				ans = ans + (rem * power);

				power = power * sb;
				num = num / 10;
			}
			System.out.println(ans);
		}
	}



