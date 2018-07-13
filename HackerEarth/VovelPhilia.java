package HackerEarth;

import java.util.*;
public class VovelPhilia {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		
		for(int i=0;i<t;i++){
	
	        int l=scn.nextInt();
	      
	        String s=scn.next();
	        int count=0;
	        
	        char[] ch = s.toCharArray();
	        int p = ch.length;
	      
	        for(int k = 0;k<ch.length;k++) {
	        	  int res=0;
	        	for(int j=k;j<ch.length;j++) {
	               if(ch[j]=='a'|| ch[j]=='e'|| ch[j]=='i'|| ch[j]=='o'||ch[j]=='u'){
		        		
		        		res=res+1;
		        	}
		        	
		        	if(res>3)
		        		break;
		        	
		        	if(res==3)
		        		count++;
		        	
	        	}
	        }
	        System.out.println(count);
	}
	
}
	

}
