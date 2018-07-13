package HackerEarth;
import java.util.Scanner;
public class Twostrings {


   
	 	
    public static void main(String args[] ) throws Exception {
      
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();   
        for(int k=0;k<t;k++){
        String str1 = scn.nextLine();                 
        String str2 = scn.nextLine();
        int counter = 0;
        int strg1 =0;
        int strg2 =0;
        int sum =0 ;
            for(int i=0;i<str1.length();i++){
            	if(str1.charAt(i)==str1.charAt(i+1)) {strg1++;}
                   for(int j=0;j<str2.length();j++){
                		
                  if(str1.charAt(i)==str2.charAt(j)){
                counter++;
                break;
                
                  }
                  //System.out.println(counter);
                  //sum = sum+counter;
                   }
            }
            for(int j=0;j<str2.length();j++){
        		if(str1.charAt(j)==str1.charAt(j+1)) {strg2++;}
            }
               
                if(str1.length()!=str2.length()) {
                	System.out.println("NO");
                }
                if(counter==(str1.length())) {
                    System.out.println("YES");}
                else if(strg1 != strg2) {
                	System.out.println("NO");
                }
                    else {
                    System.out.println("NO");}
            }
        
         
   
       
}
}



