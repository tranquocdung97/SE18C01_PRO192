/*
Task
Write a program that accepts an integer n from the user and prints the divisors of n where n > 0.

For example, if n = 12, the screen will display as below:
1 2 3 4 6 12
 */
package week2.loopstatement;

import java.util.Scanner;
public class Exc8_display_divisor_of_a_number {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
