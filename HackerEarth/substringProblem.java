package HackerEarth;

import java.util.*;

public class substringProblem {

	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		String[] strar = new String[n];
		//int numOfInputs = input.nextInt();
	   // String[] dataStore = new String[numOfInputs];
		// String[] strar1= new String[10];
		for (int i = 1; i <= n; i++) {
			strar[i-1] = scn.next();
			scn.nextLine();
		}
		
		for (int j = 0; j < q; j++) {
			String str = scn.nextLine();
			int count = 0;
			int counter=0;
			for (int i = 1; i <= n; i++) {
				if (str.contains(strar[i-1]) == true) {
					count++;
					counter=i;

				}
				

			}
			if(count>1) {
				System.out.println("-1");
			}else if(count==1) {
				System.out.println(counter);
			}else{
				System.out.println("0");
			}

		}
		
	}
}
