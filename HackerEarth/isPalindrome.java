package HackerEarth;

import java.util.Scanner;

public class isPalindrome {
	    public static void main(String args[] ) throws Exception {
	        
	        Scanner scn = new Scanner(System.in);
	        String str = scn.nextLine();                 // Reading input from STDIN
	        
	            for(int i=0;i<str.length();i++){
	            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
	                System.out.println("No");
	                return;
	            }
	        }
	         
	   
	        System.out.println("Yes");
	}
	}


