package com.day02;

/**
 * Day 02 - Variables and Data Types
 *
 * This program demonstrates the use of variables and primitive/non-primitive
 * data types in Java.
 *
 * Author : Shahbaj Alam
 */
public class VariablesDemo {

	/**
	 * Entry point of the Java application.
	 *
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {

		// Primitive data types
		byte age = 25;
		short year = 2026;
		int salary = 45000;
		long mobileNumber = 9876543210L;

		float percentage = 85.5f;
		double cgpa = 8.75;

		char grade = 'A';
		boolean isJavaLearning = true;

		// Non-primitive data type
		String name = "Shahbaj Alam";

		System.out.println("===== Student Information =====");

		System.out.println("Name          : " + name);
		System.out.println("Age           : " + age);
		System.out.println("Year          : " + year);
		System.out.println("Salary        : " + salary);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Percentage    : " + percentage);
		System.out.println("CGPA          : " + cgpa);
		System.out.println("Grade         : " + grade);
		System.out.println("Java Learning : " + isJavaLearning);

	}

}