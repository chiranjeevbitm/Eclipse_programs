package basic_String_and_Arrays;

import java.util.Scanner;

public class combination {
      public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int r = scn.nextInt();
		Calculate_nCr(n, r);
		
		
	}
  	public static int power(int n, int p) {
		int result = 1;
		while (p != 0) {
			result = result * n;
			p--;
		}
		System.out.println(result);
		return result;
	}
  	public static void Calculate_nCr(int n, int r) {
		int y=n-r;
  		int nfact = 1;
  		int rfact = 1;
  		int n_rfact =1;
  		
  		while(n>0)
  		{
  			nfact = nfact*(n);
  			n--;
  			
  		}
  		//System.out.println(nfact);
  		while(r>0)
  		{
  			rfact = rfact*(r);
  			r--;
  			
  		}
  		//System.out.println(rfact);
  		
  		while((y)>0)
  		{
  			n_rfact = n_rfact*(y);
  			y--;
  			
  		}
  		//System.out.println(n_rfact);
  		int x=(rfact*n_rfact);
  		int result = nfact/x;
  		System.out.println(result);
  		
  		
  	}
  	}

