/*
Task
Write a program that accepts two integers a and b from the user and displays all numbers from a to b (including a and b) on the screen.

For example, if a = 5, b = 9, the code will produce the following result:

5 6 7 8 9 
 */
package week2.loopstatement;

import java.util.Scanner;

public class Exc2_display_numbers_from_a_to_b {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
}
