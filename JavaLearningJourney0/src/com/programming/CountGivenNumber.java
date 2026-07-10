package com.programming;

import java.util.Scanner;

public class CountGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();

		int res = count(n);
		System.out.println(res);
	}

	private static int count(int n) {
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
