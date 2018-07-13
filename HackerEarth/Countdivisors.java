package HackerEarth;
import java.util.Scanner;
public class Countdivisors {
	

	    public static void main(String[] args )  {
	        
	        Scanner scn = new Scanner(System.in);
	        int l = scn.nextInt();
	      //  scn.nextLine();
	        int r = scn.nextInt();
	       // scn.nextLine();
	        int k = scn.nextInt();
	        //scn.nextLine();
	        int counter=0;
	        for(int i =l;i<=r;i++){
	            if(i%k==0){
	                counter++;
	            }
	        }
	        System.out.println(counter);
	        

	    }
	}

