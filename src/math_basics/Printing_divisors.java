package math_basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Printing_divisors {

	 public static int[] divisors(int n) {
		 ArrayList<Integer> divisors = new ArrayList<>();
		 
		 for(int i=1;i<=n;i++) {
			 
			 if (n%i==0) {
				  
				 divisors.add(i); 
			 }
			 
		 }
		 int arr[]= new int[divisors.size()];
		 for (int j=0;j<divisors.size();j++) {
			 arr[j]=divisors.get(j);
		 }
		 return arr;
	    }
	public static void main(String[] args) {
			
		System.out.println(Arrays.toString(divisors(8)));
	}

}
