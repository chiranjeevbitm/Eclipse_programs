package CodeChef;

import java.util.Scanner;

public class BigSale {
                public static void main(String[] args) {
					Scanner scn = new Scanner(System.in);
					int t = scn.nextInt();
					for(int i=0; i<t; i++) {
						int n = scn.nextInt();
						double total_loss=0;
						for(int j = 0; j<n;j++) {
							double price = scn.nextInt();
							double quantity = scn.nextInt();
							double perdiscount = scn.nextInt();
							
							double increased_price= price + price*(perdiscount/100);
							//System.out.println(increased_price);
							double selling_price= increased_price - increased_price*(perdiscount/100);
							//System.out.println(selling_price);
							double loss = quantity*(price-selling_price);
							//System.out.println(loss);
							total_loss= total_loss +loss;
							//System.out.println(total_loss);
						}
						System.out.println(total_loss);
						
					}
					
				}
}
