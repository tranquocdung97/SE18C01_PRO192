/*
Task
Given an integer n, write a recursive function to return the sum of all odd numbers from 1 to n.

For example, if you enter 5 as the value of n, the program produces 9 on the screen because 1 + 3 + 5 = 9.
 */
package week2.method;

import java.util.Scanner;
public class Exc7_recursive_functionp2 {
    	public static int sum(int n) {
		if (n == 1) return 1;
	    if (n % 2 == 0) {
	        return sum(n - 1);
	    } else {
	        return n + sum(n - 1);
	    }
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sum(n));
	}
}
