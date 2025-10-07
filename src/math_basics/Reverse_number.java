package math_basics;

public class Reverse_number {
	 public static int reverseNumber(int n) {
		  int sum =0;
		  
		  while(n>0) {
			  int digit =n%10;
			 n= n/10;
			 sum= sum*10+digit;
		  }
		 
		 return sum;
	    }

	public static void main(String[] args) {
		System.out.println(reverseNumber(987654310));

	}

}
