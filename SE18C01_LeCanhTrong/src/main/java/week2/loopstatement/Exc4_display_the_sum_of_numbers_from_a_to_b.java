/*
Task
Write a program that accepts two integers a and b from the user and displays the sum of all the numbers from a to b on the screen:

For example, if a = 5, b = 9, the program will produce the following result:

35
Because 5 + 6 + 7 + 8 + 9 = 35
 */
package week2.loopstatement;

import java.util.Scanner;

public class Exc4_display_the_sum_of_numbers_from_a_to_b {
   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		for (int i = a; i <= b; i++) {
			// answer += i means answer = answer + i
			answer += i;
		}
		System.out.println(answer);
	} 
}
