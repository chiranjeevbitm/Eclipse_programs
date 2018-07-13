package arrays;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
			
		//ArrayList<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		System.out.println(list);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		
//		list.set(1, 50);
//		System.out.println(list);
//		
//		
//		list.set(1, 100);
//		System.out.println(list);
//		System.out.println(list.size());
//		
//		for(int val : list) {
//			System.out.println(val);
//		}
//		System.out.println(list);
//		list.remove(1);
//		list.remove(0);
//		System.out.println(list);
		
		
//		int[] one = {1,1,2,2,3,3,4,5,5,5};
//		int[] two = {1,2,3,3,4,5,5};
//		System.out.println(intersection(one, two));
//	
		
		
		int[] one = {9,2,3,4};
		int[] two = {9,8,6};
		System.out.println(SumOfTwoArrays(one, two));
	}
	
	public static ArrayList<Integer> intersection(int[] one ,int[] two){
		ArrayList<Integer> ans = new ArrayList<>();
		//logic
		int i=0;
		int j=0;
		while(i<one.length&&j<two.length) {
			  if(one[i]<two[j]) {
				  i++;
			  }
			  else if(one[i]>two[j]) {
				  j++;
			  }else {
				  ans.add(one[i]);
				  i++;
				  j++;
			  }
			}
		
		return ans;
	}
	
	public static ArrayList<Integer> SumOfTwoArrays(int[] one ,int[] two){
		ArrayList<Integer> ans = new ArrayList<>();
		//logic
		int i = one.length-1;
		int j = two.length-1;
		int carry =0;
		while(i>=0|| j>=0) {
			
			int sum = carry;
			if(i>=0){
				sum=sum+one[i];
				
			}
			if(j>=0) {
				sum = sum + two[j];
			}
			int rem = sum%10;
			carry =  sum/10;
			ans.add(0,rem);
			i--;
			j--;
		}
		if(carry!=0) {
			ans.add(0,carry);
		}
		
		
		return ans;
	}



}
