package strings;

import java.util.Scanner;

public class StringDemo {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// String str = "hello";
		// charBycharString(str);
		// printSubstring(str);

		// String str = "NITIN";
		 //String str = "nitin";

		// boolean ans = IsPalindromeSubStr(str);
		// System.out.println(ans);
		// String str = "CHIRANJEEV";
		// PrintAllPalindrome(str);

		// adding
		// String str = "hello";
		// int pos = 2;
		// String ch ='n'; //henlo
		// addchar(str, ch, pos);

		// replace
		// String str = "hello";
		// int pos = 4; 
		// String ch ="bye";//hellbye
		// replacechar(str, ch, pos);

		// deleting
		// String str = "hello";
		// int pos = 4;
		// deletechar(str, pos);

	}

	public static void charBycharString(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

		}
	}

	public static void addchar(String str, String ch, int pos) {
		str = str.substring(0, pos) + ch + str.substring(pos);
		System.out.println(str);
	}

	public static void replacechar(String str, String ch, int pos) {
		str = str.substring(0, pos) + ch + str.substring(pos + 1);
		System.out.println(str);
	}

	public static void deletechar(String str, int pos) {
		str = str.substring(0, pos) + str.substring(pos + 1);
		System.out.println(str);
	}
    //Assignment 5 String problem 6
	public static void printSubstring(String str) {
		int i = 0;
		int j = 1;
		int high = str.length();
		for (i = 0; i <= high - 1; i++) {
			for (j = i + 1; j <= high; j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}

	// Assignment 5 String problem 1
	public static boolean IsPalindromeSubStr(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;

			}
			left++;
			right--;
		}

		return true;
	}

	// Assignment 5 String problem 2
	public static void PrintAllPalindrome(String str) {
		int i = 0;
		int j = 1;
		int noofpalindrome = 0;
		int high = str.length();
		for (i = 0; i <= high - 1; i++) {
			for (j = i + 1; j <= high; j++) {
				if (IsPalindromeSubStr(str.substring(i, j)) && str.substring(i, j).length() > 1) {
					System.out.println(str.substring(i, j));
					noofpalindrome++;
				}
			}
		}
		System.out.println(noofpalindrome);
	}



}
