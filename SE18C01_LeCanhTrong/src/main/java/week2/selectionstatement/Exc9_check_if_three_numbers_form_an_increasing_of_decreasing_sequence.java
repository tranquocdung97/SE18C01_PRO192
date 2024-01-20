/*
Task
Write a program that accepts 3 integers a, b, c from the user then checks whether a, b, c (in this order) can make an increasing numeric sequence.

If a ≤ b and b ≤ c, print the following line:

increasing
If a ≥ b and b ≥ c, print the following line:

decreasing
If a, b, c are not in the 2 cases above, print the following line:

neither increasing nor decreasing order
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc9_check_if_three_numbers_form_an_increasing_of_decreasing_sequence {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    if (a <= b && b <= c) {
	        System.out.println("increasing");
	    } else if (a >= b && b >= c) {
	    	System.out.println("decreasing");
	    } else {
	    	System.out.println("neither increasing nor decreasing order");
	    }
	}
}
