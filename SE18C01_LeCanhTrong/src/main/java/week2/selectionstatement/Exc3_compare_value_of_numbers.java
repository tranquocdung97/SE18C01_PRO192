/*
Task
Write a program that accepts two integers a and b from the user then checks the following conditions:

If a is greater than or equal to b, print the following line on the screen:

a is greater than or equal to b
otherwise, if a is smaller than b, print the following line on the screen:

a is smaller than b
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc3_compare_value_of_numbers {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		} else {
			System.out.println("a is smaller than b");
		}
	}
}
