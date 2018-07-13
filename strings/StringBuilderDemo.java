package strings;

import java.util.Scanner;

public class StringBuilderDemo {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// StringBuilder sb = new StringBuilder("hEllo");

		// string builder through scanner
		// String str = scn.nextLine();
		// StringBuilder sb1 = new StringBuilder(str);

		// string builder to string conversion
		// String str2 = sb1.toString();
		// System.out.println(str2);

		//
		//
		// System.out.println(sb.charAt(2));
		//
		// sb.insert(2, 'c');
		// System.out.println(sb);
		//
		// sb.setLength(3);
		// System.out.println(sb);
		//
		// sb.setCharAt(2, 'b');
		// System.out.println(sb);
		//
		//
		// String str = scn.nextLine();
		// StringBuilder sb1 = new StringBuilder(str);
		// sb1.reverse();
		// System.out.println(sb1);

		// palindrome
		// boolean ans = isPalindromeSB(sb);
		// System.out.println(ans);
		
		//max frequency
		//String str = "heslssldffffflo";
		// System.out.println(asciiDiffSB(str));
		//char ch = Maxfreq1(str);
		//System.out.println(ch);
		
		//delete duplicate
		String str = "heslssldffffflo";
		duplicateFreq(str);
		}

	public static boolean isPalindromeSB(StringBuilder sb) {
		/// StringBuilder sb1 = sb.reverse();

		if (sb.equals(sb.reverse())) {
			return true;
		} else
			return false;
	}

	// Assignment 5 String problem 3
	public static String StringToggle(String str) {
		int i = 0;
		StringBuilder sb = new StringBuilder(str);
		while (i < str.length()) {
			int j = str.charAt(i);
			if (j >= 'A' && j <= 'Z') {
				sb.setCharAt(i, (char) (j + 32));
			}

			if (j >= 'a' && j <= 'z') {
				sb.setCharAt(i, (char) (j - 32));
			}
			i++;

		}
		return sb.toString();
	}

	public static String StringToggle1(String str) {
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while (i < str.length()) {
			int j = str.charAt(i);
			if (j >= 'A' && j <= 'Z') {
				char ch = (char) (j + 32);
				sb.append(ch);
				// sb.setCharAt(i, (char) (j+32));
			}

			if (j >= 'a' && j <= 'z') {
				char ch = (char) (j - 32);
				sb.append(ch);
				// sb.setCharAt(i, (char) (j-32));
			}
			i++;

		}
		return sb.toString();
	}

	public static String assign5p4(String str) {
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while (i < str.length()) {

			int j = str.charAt(i);
			if (i % 2 == 0) {
				char ch = (char) (j - 1);
				sb.append(ch);

			} else {
				char ch = (char) (j + 1);
				sb.append(ch);
			}
			i++;
		}

		return sb.toString();
	}

	public static void asciiDiff(String str) {
		int i = 1;
		StringBuilder sb = new StringBuilder();
		while (i < str.length()) {
			System.out.println(str.charAt(i - 1));
			char ch = str.charAt(i - 1);
			int j = str.charAt(i - 1);

			int k = str.charAt(i);
			System.out.println(k - j);

			i++;
		}

		System.out.println(str.charAt(str.length() - 1));

		// return sb.toString();

	}

	public static String asciiDiffSB(String str) {
		int i = 1;
		StringBuilder sb = new StringBuilder();
		while (i < str.length()) {
			sb.append(str.charAt(i - 1));
			char ch = str.charAt(i - 1);
			int j = str.charAt(i - 1);

			int k = str.charAt(i);
			sb.append(j - k);

			i++;
		}

		sb.append(str.charAt(str.length() - 1));

		return sb.toString();

	}

	public static void Maxfreq(String str) {

		// StringBuilder sb = new StringBuilder();
		int count[] = new int[str.length()];
		for (int i = 0; i <= str.length() - 1; i++) {
			int j = 0;
			if (str.charAt(j) == str.charAt(i)) {
				count[j]++;
				j++;
			}
			// count[i]++;
			// System.out.println(count[i]);
			// System.out.println(str.charAt(i));
		}
		// System.out.println(count[i]);

	}

	public static char Maxfreq1(String str) {
		int[] arr = new int[126];
		for (int i = 0; i < str.length(); i++) {
			int asci = str.charAt(i);

			arr[asci] = arr[asci] + 1;
		}
		int indx = max(arr);
		return (char) indx;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

				index = i;
			}
		}
		return index;
	}
       public static void DeleteDuplicate(String str) {
    	   str = str +" ";
    	  
    	   String ans = "";
    	   char ch1;
    	   char ch2;
    	   for (int i = 1; i < str.length(); i++) {
    		 ch1 = str.charAt(i);
    		 ch2 = str.charAt(i-1);
    		 if(ch1!=ch2) {
    			 ans=ans+ch1;
    		 }
    	   }
    	   System.out.println(ans);
    	  // StringBuilder sb = new StringBuilder(str);
//    		for (int i = 1; i <= sb.length() -1; i++) {
//    		
//    			if (sb.charAt(i-1) == sb.charAt(i)) {
//    				sb.deleteCharAt(i-1);
//    				
//    			}
//    			//System.out.println(str.charAt(i));
//       }
//    		return sb.toString();
}
       
       
       public static void duplicateFreq(String str) {
    	   str = str +" ";
     	  
    	   String ans = "";
    	   char ch1;
    	   char ch2;
    	   for (int i = 1; i < str.length(); i++) {
    		 ch1 = str.charAt(i);
    		 ch2 = str.charAt(i-1);
    		 if(ch1!=ch2) {
    			 ans=ans+ch1;
    		 }
    		 int count =1;
    		 if(ch1 ==ch2) {
    			 count++;
    			 ans=ans+count;
    			 
    		 }
    		 //System.out.println(count);
    		 
    	   }
    	   System.out.println(ans);
       }
}
