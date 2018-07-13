package CodeChef;
import java.util.Scanner;
public class Pins {


	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			for(int i =0;i<t;i++){
				int count =0;
				int n = scn.nextInt();
				
		 
		for(int j=0;j<=Math.pow(0,n);j++){
			int p = 0;
			int temp=j;
			int len =0;
		     int  reverse_num=0;
		      while(temp!=0){
		        int rem=temp%10;
		         temp=temp/10;
		         len++;
		         reverse_num=reverse_num*10+rem;
		      }
		      if(len==n){
		      if(j==reverse_num)
		       p++;
		   }
		      System.out.println(p);
		}
		int q = (int)Math.pow(0,n);
		
		System.out.println(q);
	
	 }
	 
			
}
}


