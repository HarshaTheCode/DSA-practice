package pattarns_In_Java;

import java.util.Scanner;

public class Second_pattern {
	public static int pattern2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any random number for the generation of the *'s : ");
		int n =sc.nextInt();

		System.out.println(n);

		for (int i = 0; i <n; i++) {

			for (int j = 0; j <=i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		return n;
	}

	public static void main(String[] args) {
		pattern2();

	}

}
