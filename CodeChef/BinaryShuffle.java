package CodeChef;

import java.util.Scanner;
 
public class BinaryShuffle {

	

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			long t = scn.nextLong();
			for (int i = 0; i < t; i++) {

				long numA = scn.nextLong();
				long numB = scn.nextLong();

				System.out.println(countOperations( numA, numB ));
		}
		}
	 
		public static long countOne(long number) {
			long result = 0;
			for ( ; number>0; number /= 2 ) 
			   result += number % 2;
			   return result;
			
			
		}

		public static long countOperations(long A,long B )
		{
			   // Special cases
			        if ( A == B ) return 0;
			   else if ( B == 0 ) return -1;
			   else if ( B == 1 ) return ( A == 0 ? 1 : -1 );

			   long ops = countOne( B - 1 ) - countOne( A ) + 1;
			   return ops > 0 ? ops : 2;
			}
	}

