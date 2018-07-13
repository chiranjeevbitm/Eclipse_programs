package HackerEarth;
import java.util.*;

public class BigSum {


   
	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		
			int n = scn.nextInt();
		    long arr[] = new long[n];
		
	     	long sum = 0;
			for (int i = 0; i < n; i++) {

				arr[i] = scn.nextLong();
				sum = sum +arr[i];
                
			}
		

			System.out.println(sum);
		}

	}



