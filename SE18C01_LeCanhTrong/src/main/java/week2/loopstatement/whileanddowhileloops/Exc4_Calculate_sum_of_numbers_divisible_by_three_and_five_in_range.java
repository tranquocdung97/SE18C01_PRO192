/*
Task
Write a program that accepts two integers a and b from the user then prints all numbers from a to b, which are divisible by 3 and 5.

For example, if a = 1, b = 50, the program produces the following result:

15 30 45
 */
package week2.loopstatement.whileanddowhileloops;

import java.util.Scanner;
public class Exc4_Calculate_sum_of_numbers_divisible_by_three_and_five_in_range {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
