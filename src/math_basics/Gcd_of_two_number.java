package math_basics;

public class Gcd_of_two_number {

	public static int GCD(int a, int b) {

		//		  int some=0; 
		//		  if (n2>n1) {
		//		  for (int i=1; i<n2;i++) {
		//			  if (n1%i==0 && n2%i==0) {
		//				  some=i;
		//			  }
		//		  }
		//		  }else {
		//			  for(int i=1;i<n1;i++) {
		//				  if (n1%i==0 && n2%i==0) {
		//					  some=i; 
		//				  }			  
		//			  }
		//			  
		//		  }
		//		  System.out.println(some);
		//		  return some;


		/* this is advanced algo method 
			the name of the algo is Euclidean alogo this is advanced method for getting faster result 
		 */
		while (a>0&&b>0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		} if(a==0) return b;
		return a;
	} 




	public static void main(String[] args) {
		System.out.println(GCD(20,10));
	}
}
