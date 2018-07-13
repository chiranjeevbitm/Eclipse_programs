package HackerEarth;

import java.util.Scanner;

public class lexSmalSubsets {
	public static Scanner scn = new Scanner(System.in);
	
	 public static void main(String[] args)
	    {
	
	long n = scn.nextLong();
	long i,j,m,count;
	 for(i=0;i<=n;i++) {
		 long x = scn.nextLong();
		 String s = scn.nextLine();
		 m=0;
		 for(j=0;j<x-1;j++) {
			 count = 0;
			 while(s.charAt((int) i)<=s.charAt((int)i+1)&&i<x-1)
	         {
	          count++;
	          i++;
		 } 
			 m=m+count;
	 }
		
	 System.out.println(m+x);
	    
	    }
	    }
}
	
	 


