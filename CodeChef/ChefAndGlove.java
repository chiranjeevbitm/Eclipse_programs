package CodeChef;

import java.util.Scanner;

public class ChefAndGlove {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		

		
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();

			int[] L = new int[n];
			int[] G = new int[n];
			int counter = 0;
			int counter1 = 0;
			int counter2 = 0;
			int counter3 = 0;
			

			for (int j = 0; j < n; j++) {
				L[j] = scn.nextInt();
			}

			for (int k = 0; k < n; k++) {
				G[k] = scn.nextInt();
			}

			for (int j = 0; j < n; j++) {
                 
				if(L[j] == G[j]) { counter++;}
				
				
				if (L[j] <= G[j] && L[j] == G[n - (j + 1)]) {
					counter2++;
				}
				
				if (L[j] <= G[j] ) {
					counter1++;
				}

			

				if (L[j] <= G[n - (j + 1)] && counter<n) {
					counter3++;
				} 
			}
	

			if(counter2 == n){
				System.out.println("both");
			
		}
			else if(counter1 == n){
				System.out.println("front");
			
		}
			else if(counter3 == n){
				System.out.println("back");
			
		}
			else 
				System.out.println("none");
	

		}
	}
}

