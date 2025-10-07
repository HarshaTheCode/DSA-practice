package pattarns_In_Java;

import java.util.Scanner;

public class Sixth_pattern {
	public static int pattern6() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number for the generation of the *'s : ");
		int n =sc.nextInt();

		System.out.println(n);

		for (int i = n; i >=0; i--) {

			for (int j = 1; j <=i; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}
		return n;
	}
	
	public static void main(String[] args) {
		pattern6();
	}
}
