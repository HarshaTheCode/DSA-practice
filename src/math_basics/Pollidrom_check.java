package math_basics;

public class Pollidrom_check {

	public static boolean reverseNumber(int n) {
		int DuplicateValue=n;  
		int sum =0;
		
		while(n>0) {
			int digit =n%10;
			n= n/10;
			sum= sum*10+digit;
		}
		
		return DuplicateValue==sum;
		}
	public static void main(String[] args) {
		System.out.println(reverseNumber(12921));

	}

}
