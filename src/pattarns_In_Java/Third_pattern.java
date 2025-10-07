package pattarns_In_Java;

import java.util.Scanner;

public class Third_pattern {
	public static int pattern3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number : ");
		int n =sc.nextInt();

		for (int i = 0; i < n; i++) {
			
//			System.out.print(i+1);
			for (int j = 0; j <=i; j++) {
				
				System.out.print(j+1);//this will print the Third pattern 
							
			}
			System.out.println();
		}
		
		return n;
	}

	public static int pattern4() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number : ");
		int n =sc.nextInt();

		for (int i = 0; i < n; i++) {
			
//			System.out.print(i+1);
			for (int j = 0; j <=i; j++) {
				
				System.out.print(i+1);//this will print thevFourh pattern 
							
			}
			System.out.println();
		}
		
		return n;
	}
	public static void main(String[] args) {
		pattern3();
		pattern4();

	}

}
