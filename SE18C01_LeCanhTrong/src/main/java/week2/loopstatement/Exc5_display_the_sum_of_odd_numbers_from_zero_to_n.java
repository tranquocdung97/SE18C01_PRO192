/*
Write a program that accepts an integer n from the user and displays the sum of all odd numbers from 0 to n on the screen.

For example, if n = 7, the program will produce the following result:

16
Because 1 + 3 + 5 + 7 = 16
 */
package week2.loopstatement;

import java.util.Scanner;

public class Exc5_display_the_sum_of_odd_numbers_from_zero_to_n {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				answer += i;
			}
		}
		System.out.println(answer);
	}
}
