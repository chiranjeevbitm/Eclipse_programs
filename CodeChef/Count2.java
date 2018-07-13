package CodeChef;

import java.util.Scanner;

public class Count2 {
               public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int counter = 0;
				int[] arr = new int[n];
				for(int i= 0;i<n;i++)
				{
					arr[i] = scn.nextInt();
					if(arr[i]==2) {
						counter++;
					}
 				}
				System.out.println(counter);
				
			}
}
