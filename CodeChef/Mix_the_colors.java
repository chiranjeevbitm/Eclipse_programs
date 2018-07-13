 package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class Mix_the_colors {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int l=0;l<t; l++) {
		int n = scn.nextInt();
		int[] colors = new int[n];
		
		
		for(int i =0;i<n; i++) {
		colors[i]= scn.nextInt();
		}
		result(n, colors);
		
		}
        
	}

	public static boolean distinctValues(int[] colors) {
		for (int i = 0; i < colors.length - 1; i++) {
			for (int j = i + 1; j < colors.length; j++) {
				if (colors[i] == colors[j]) {
					return false;
				}
			}
		}
		return true;
	}


        public static int result(int n,int[] colors) {
        	int counter = 0;
        			if(distinctValues(colors)==true) {
        				System.out.println("0");
        				
        			}
        			else {
        	
      
		//while (distinctValues(colors) != true) {
			Arrays.sort(colors);
			for (int j = 1; j < n; j++) {
				
			
				colors[j] += colors[j-1];
				Arrays.sort(colors);
				
				counter++;
				System.out.println(counter);
				//if(distinctValues(colors)==true) break;
				//Arrays.sort(colors);
				

			}
			}
			for (int j = 0; j < n; j++) {
				System.out.print(colors[j]+ " ");
			}

	//	}
		
		System.out.println(counter);
		
        
        			return counter;
        }
	

}
