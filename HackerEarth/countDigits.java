package HackerEarth;
import java.util.Scanner;
public class countDigits {



   
  public static void main(String args[] ) throws Exception {
      
        Scanner scn = new Scanner(System.in);
        
       
        String str = scn.nextLine();  
                
        for(int i=48;i<=57;i++){
             int count=0; 
            for(int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                }
            }
                System.out.println(i-48+" "+count);
        
        }
       
       
}
}


