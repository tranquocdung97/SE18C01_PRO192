/*
Task
Given an integer n. Write a recursive function that computes and returns the result of n!

For example, if you enter 5 as the value of n, the program produces 120 on the screen.
 */
package week2.method;

import java.util.Scanner;
public class Exc6_recursive_function {
    	public static int factorial(int n) {
	    if (n == 1) return 1;
	    return n * factorial(n - 1);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(factorial(n));
	}
}
