package arrays;

import java.util.Arrays;

public class Arrays_Sorting {

	public static void main(String[] args) {

		int[] arr = { 99, 88, 77, 66, 55, 44 };
		// bubblesort(arr);

		//selectionsort(arr);
		
		insertionsort(arr);
		Arrays_Operations.display(arr);

	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		Arrays.sort(arr);
	}

	public static void bubblesort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
	}

	public static void selectionsort(int[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = min + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;

				}

			}
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}
	}

	public static void insertionsort(int[] arr) {
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			int val = arr[counter];

			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}
}