package HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class bufferedReader {



    public static void main(String[] args) throws IOException
    {
 
        BufferedReader br = new BufferedReader(
                              new InputStreamReader(System.in));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken()); 
         int[] arr = new int[n];
         int x;
         int s=0;
         arr[0]=0;
         //String line = br.readLine(); // to read multiple integers line
         //String[] strs = line.trim().split("\\s+");
         for (int i = 0; i < n; i++) {
              x =Integer.parseInt(st.nextToken());
              s+=x;
              arr[i]=s;
            }
           
         for(int i=1;i<=q;i++){
             int l = Integer.parseInt(st.nextToken());
             int r =Integer.parseInt(st.nextToken());
             System.out.println((arr[r]-arr[l-1])/(r-l+1));
         }
    }
}



