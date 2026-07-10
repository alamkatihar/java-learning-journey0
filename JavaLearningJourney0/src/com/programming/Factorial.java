package com.programming;

import java.util.Scanner;

public class Factorial {

	public static int fact(int f) {
		int res = 1;

		for (int i = 1; i <= f; i++) {
			res *= i;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int fact = fact(n);

		System.out.println(fact);
	}

}
