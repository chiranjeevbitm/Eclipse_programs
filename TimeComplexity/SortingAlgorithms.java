package TimeComplexity;

public class SortingAlgorithms {
	public static void main(String[] args) {
		//
		// int[] one = {1,3,4,11,15,18};
		// int[] two = {2,5,8,13,19};
		// int[] merged = SortTwoArrays(one, two);
		//
		// for(int val:merged) {
		// System.out.println(val);
		// }
		// int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 0 };
		// arr = mergSort(arr, 0, arr.length - 1);
		// for (int val : arr) {
		// System.out.println(val);
		// }
		int[] arr = { 8, 160, 30, 7, 2 };
		quickSort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static int[] SortTwoArrays(int[] one, int[] two) {
		int[] result = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				result[k] = one[i];
				i++;
				k++;
			} else {
				result[k] = two[j];
				j++;
				k++;

			}

		}
		if (i == one.length) {
			while (j < two.length) {
				result[k] = two[j];

				j++;
				k++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				result[k] = one[i];
				i++;
				k++;
			}
		}
		return result;
	}

	public static int[] mergSort(int[] arr, int low, int high) {
		// base case
		if (low == high) {
			int[] br = new int[1];
			br[0] = arr[low];
			return br;
		}
		int mid = (low + high) / 2;
		int[] fh = mergSort(arr, low, mid);
		int[] sh = mergSort(arr, mid + 1, high);

		int[] sorted = SortTwoArrays(fh, sh);
		return sorted;
	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;
		while (left <= right) {//if < {10,20} fails
			while (arr[left] < pivot) {//if <= and pivot is greatest then fails
				left++;
			}

			while (arr[right] > pivot) {//if >= and pivot is smallest then fails
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}
}
