package math_basics;

public class Gcd_of_two_number {
	
	  public static int GCD(int n1, int n2) {
		  
		  int some=0;
		  if (n2>n1) {
		  for (int i=1; i<n2;i++) {
			  if (n1%i==0 && n2%i==0) {
				  some=i;
			  }
		  }
		  }else {
			  for(int i=1;i<n1;i++) {
				  if (n1%i==0 && n2%i==0) {
					  some=i; 
				  }			  
			  }
			  
		  }
		  System.out.println(some);
		  return some;
	    } 
	  
	public static void main(String[] args) {
	 	GCD(20,10);
	}
}
