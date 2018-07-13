package HackerEarth;
import java.util.*;
public class FindProduct {



    public static void main(String args[] ) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        long[] a =new long[n];
        long ans =1;
        for(int i=0;i<n;i++){
            a[i]=scn.nextLong();
            ans =(long) ((ans * a[i])%(Math.pow(10,9)+7));
           
        }
        System.out.println(ans);
        

        
    }
}

