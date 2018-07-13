package HackerEarth;


	import java.util.Scanner;
	public class SeatingArrangement {
	 	    public static void main(String args[] ) throws Exception {
		        
		        Scanner scn = new Scanner(System.in);
		       int t = scn.nextInt();
		       for(int i=0;i<t;i++){
		           int n =scn.nextInt();
		           if(n%6==0){
		               System.out.println((n+1)+" "+"WS");
		           }
		           if(n%6==1){
		               System.out.println((n+11)+" "+"WS");
		           }
		           
		           if(n%6==5){
		               System.out.println((n+3)+" "+"MS");
		           }
		           if(n%6==2){
		               System.out.println((n+9)+" "+"MS");
		           }
		            if(n%6==4){
		               System.out.println((n+5)+" "+"AS");
		           }
		           if(n%6==3){
		               System.out.println((n+7)+" "+"AS");
		           }
		           
		         
		   
		        
		}
		}


}
