package pattarns_In_Java;

import java.util.Scanner;

public class Seventh_patternf {
	
	public static int pattern7() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number for the generation of the *'s : ");
		int n =sc.nextInt();

//		System.out.println(n);

		for (int i = 0; i<n; i++) {
			// For the Spaces
			for (int j = 0; j <n-i-1; j++) {
				System.out.print(" ");	
			}
			//For the *'s 
			for (int j = 0; j <i*2+1; j++) {
				System.out.print("*");	
			}
			//For the Spaces again 
			for (int j = 1; j<n-i; j++) {
				System.out.print(" ");	
			}
			
			System.out.println();
		}
		return n;
	}
	
	public static int pattern8() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number for the generation of the *'s : ");
		int n =sc.nextInt();

//		System.out.println(n);
		// for the spaces
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print(" ");	
			}
			// For the stars
			for (int j = 0; j <2*(n-i)-1; j++) {
				System.out.print("*");	
			}
			
			//For the Spaces again 
			for (int j = 0; j<i; j++) {
				System.out.print(" ");	
			}
			
			System.out.println();
		}
		return n;
	}

	
	
	public static void main(String[] args) {
			pattern8();
	}

}
