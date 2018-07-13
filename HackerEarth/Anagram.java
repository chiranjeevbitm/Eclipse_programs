package HackerEarth;
 import java.util.Scanner;
public class Anagram {

	
 	
    public static void main(String args[] ) throws Exception {
      
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        for(int k=0;k<t;k++){
        String str1 = scn.nextLine();                 // Reading input from STDIN
        String str2 = scn.nextLine();
        int counter = 0;
            for(int i=0;i<str1.length();i++){
                   for(int j=0;j<str2.length();j++){
                       
                  if(str1.charAt(i)==str2.charAt(j)){
                counter++;
                  }
                   }
            }
                int rv  = (str1.length()+str2.length())-2*counter;
                 System.out.println(rv);
            }
        
         
   
       
}
}