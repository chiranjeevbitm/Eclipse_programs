package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class Up_and_Down {

    public static void main(String[] args) 
    
    {
    	Scanner scn = new Scanner(System.in);
    	
    	int t = scn.nextInt();
    	for(int l= 0; l<t;l++) {
    		int n = scn.nextInt();
    		int k = scn.nextInt();
    		int[] arr = new int[n];
    		for(int j=0;j<n;j++) {
    			arr[j]=scn.nextInt();
    		}
	     
	       
	        int res1 = 0;
	        int res2 =0 ;
	        int res3 =0;
	        int res4 = 0;
	        for (int i=0; i<k; i++)
	           res1 += arr[i];
	
	        int curr_sum = res1;
	        
	        
	        for (int i=k; i<n; i++)
	        {
	           curr_sum += arr[i] - arr[i-k];
	           res1 = Math.max(res1, curr_sum);
	           res2 = Math.min(res1, curr_sum);
	        }
	       
	       if(n==k) {
	    	   System.out.println("0");
	    	   
	       }
	       else if(k==1)
	       {
	    	   Arrays.sort(arr);
	    	   
	    	   System.out.println(arr[n-1]-arr[0]);
	       }
	       else if(n==k+1) {
	       for (int i=0; i<n-1; i++) {
	           res3 += arr[i];}
	      
	       for (int i=1; i<n; i++) {
	       res4 += arr[i];}
	       if(res3>res4) {System.out.println(res3-res4);}
	       else
	    	   System.out.println(res4-res3);
	       }
	      else
	        System.out.println(res1-res2);
	        
	        
	    }
    }
}
	     
	    


