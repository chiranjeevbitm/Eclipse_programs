package basic_String_and_Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class GCD_or_HCF{
	public static Scanner scn = new Scanner(System.in);

public static void main(String[] args) {
	
GCD();
	
	
}
public static void GCD() {
	
	
	int divident = scn.nextInt();
	int divisor = scn.nextInt();
	
	
	
	while(divident % divisor !=0)
	{
		int rem = divident % divisor;
		divident = divisor ;
		divisor = rem ;
	}
	System.out.println(divisor);
		


}
public static void GCD_of_arr() {
	int t = scn.nextInt();
	int counter =0;
	while(t!=0) {
		int soa = scn.nextInt();
		int[] a = new int[soa];
		for(int i=0;i<soa;i++){
			a[i]=scn.nextInt();
		
		}
		Arrays.sort(a);
		for(int i=0;i<soa;i++){
		while(a[i] % a[0] !=0)
		{
			int rem = a[i] % a[0];
			a[i] = a[0] ;
			a[0] = rem ;
		}
		
			

	}
	System.out.println(a[0]);
	if(a[0]==1) {
		System.out.println(0);
	}else {
	for(int i=2;i<soa;i++) {
		if(a[i]%(a[0]*a[1])==0) {
			counter++;
		}
		if(a[1]%a[0]==0) {
			counter=0;
		}
	}
	if(counter==0) {
		System.out.println(-1);
	}else
	System.out.println(counter);
	}
	
	
	
}
}
}

