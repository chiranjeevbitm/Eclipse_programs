package HackerEarth;
import java.util.Scanner;
public class fact {
	


		   public static void main(String[] args )  {
		        
		        Scanner scn = new Scanner(System.in);
		        int n = scn.nextInt();
		        int rv =1;
		        while(n!=0){
		            rv = rv*(n);
		            n = n-1;
		        }
		        
		        System.out.println(rv);
		        

		    }
		}

