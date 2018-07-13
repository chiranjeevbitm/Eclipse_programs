package HackerEarth;
import java.util.Scanner;

public class ToggleCase {

    public static void main(String args[] ) {
  
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();  
        
        for(int i=0;i<str.length();i++){
        	int ch =(int)str.charAt(i);
        	if(ch>=97&&ch<=123) {
        		ch =ch-32;
        		System.out.print((char)ch);
        	}else if(ch>=65&&ch<=91) {
        		ch =ch+32;
        		System.out.print((char)ch);
        	}
           
           
        }
       
    }
}


