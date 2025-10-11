package math_basics;

public class Isprime {
	public static boolean isPrime(int n) {
        for(int i=2;i<n;i++){
          if(n%i==0){
           return false;
          }
          else return true;
        }
		  return false;
  }
	public static void main(String[] args) {
	System.out.println(	isPrime(7));

	}

}
