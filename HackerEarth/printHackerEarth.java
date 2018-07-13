package HackerEarth;

import java.util.Scanner;

public class printHackerEarth {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		scn.nextLine();
		 String s=scn.nextLine();
		int ch = 0;
		int ca = 0;
		int ce = 0;
		int cr = 0;
		int ck = 0;
		int ct = 0;
		int cc = 0;
		int  value =0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'h')
				ch++;
			if (s.charAt(i) == 'a')
				ca++;
			if (s.charAt(i) == 'c')
				cc++;
			if (s.charAt(i) == 'k')
				ck++;
			if (s.charAt(i) == 'e')
				ce++;
			if (s.charAt(i) == 'r')
				cr++;
			if (s.charAt(i) == 't')
				ct++;
		}
//		ch=ch/2;
//		ca=ca/2;
//		ce=ce/2;
//		cr=cr/2;
		//System.out.println((ch+ca+ce+cr+ck+ct+cc)/7);
		while(ch>=2 && ca>=2 && cc>=1 && ck>=1 && ce>=2 &&cr>=2&&ct>=1) 
		{
		ch-=2; // keep subtracting till it condition become false
		ca-=2; // and at the end if whole subtract then it will be counted as one 
		cc-=1; // and so on 
		ck-=1;
		ce-=2;
		cr-=2;
		ct-=1;
		value++;
	}
		System.out.println(value);

}
}
