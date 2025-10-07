package math_basics;

public class Armstrong_Numbers {
	public static boolean isArmstrong(int n) {
		int sum =0;
		int duplicate=n;
		int count =0;
		while (n>0) {
			count=n%10;
			n=n/10;
			sum =sum +count*count*count;
			
		}
		return sum==duplicate ;
	}


	public static void main(String[] args) {
		System.out.println(isArmstrong(153));

	}

}
