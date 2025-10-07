package math_basics;

public class Count_digits {
	
	 public static int countDigit(int n) {
		 int count =0;
		 while (n>0) {
			 
			  n=n/10;
			 count++;
			 System.out.println(count);
		 }
		 return count ;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countDigit(567));
	}

}
