package CodeChef;

import java.util.Scanner;

public class MagicSet {

	 public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			for(int i =0;i<t;i++){
				int count =0;
				int n = scn.nextInt();
				int m = scn.nextInt();
				int a[] = new int[n];
				for(int j =0;j<n;j++){
					a[j]=scn.nextInt();
					if(a[j]%m==0){
						count++;
					}
				}
				System.out.println(count);
				

				
			}
}
}

