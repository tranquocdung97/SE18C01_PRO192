/*
Task
Write a program that accepts an integer n from the user then checks the following conditions:

If n is a positive integer, print the following line on the screen:

n is a positive number
If n is a negative integer, print the following line on the screen:

n is a negative number
If n is equal to 0, print the following line on the screen:

n is equal to 0
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc2_check_number_positive_negative {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println("n is equal to 0");
		} else if (n < 0) {
			System.out.println("n is a negative number");
		} else {
			System.out.println("n is a positive number");
		}
	}
}
