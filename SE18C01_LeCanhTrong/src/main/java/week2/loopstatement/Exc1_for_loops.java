/*
Task
Write a program that accepts an integer n then displays all the numbers from 1 to n on the screen, which are separated by space.

For example, if you enter 10 from the keyboard, the program will produce the following result:

1 2 3 4 5 6 7 8 9 10 
 */
package week2.loopstatement;

import java.util.Scanner;

public class Exc1_for_loops {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
