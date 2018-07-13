package basic_String_and_Arrays;

import java.util.Scanner;

public class inverse {
              public static void main(String[] args) {
            	  Scanner scn = new Scanner(System.in);

            	  int num =  scn.nextInt();
            	  int counter = 1;
            	  int ans = 0;
            	  while(num!=0)
            	  {
            		  int rem = num % 10;
            		  ans = ans + counter * (int)Math.pow(10, (rem-1));
            				  num = num /10;
            				  counter++;
            	  }
            	  System.out.println(ans);
			}
}
