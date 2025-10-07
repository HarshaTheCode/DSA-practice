package pattarns_In_Java;

import java.util.Scanner;

public class First_pattern {

	public static int patterns() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number for the generation of the *'s : ");
		int n =sc.nextInt();
			
		System.out.println(n);
		
		for (int i = 0; i <n; i++) {
			
			for (int j = 0; j <n; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		return n;
	}
	
	public static void main(String[] args) {
		
		patterns();
		
			
	}

}
