/*
Task
Write a program that accepts an integer n from the user then displays all numbers from n to -n in descending order.

For example, if n = 5, the code will produce the following result:

5 4 3 2 1 0 -1 -2 -3 -4 -5
 */
package week2.loopstatement;

import java.util.Scanner;

public class Exc3_display_numbers_fromn_to_minus_n {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i >= -n; i--) {
			System.out.print(i + " ");
		}
	}
}
