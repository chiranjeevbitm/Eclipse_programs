package HackerEarth;

import java.util.*;
public class FindThePattern {
	
	

	public static void main(String args[] ) throws Exception {

	Scanner scn = new Scanner(System.in);
	long n = scn.nextLong();
	long[] a = new long[(int)n];
	for(long i=0;i<n;i++)
	a[(int)i]=scn.nextLong();
	
	Arrays.sort(a);
	long sum = a[(int)0]+a[(int)n-1];
	System.out.println(sum);

	}
	}