/*
Task
Write a program that accepts an integer n from the user and prints all even numbers from n to 100 on the screen.

For example, if n = 90, the program will produce the following result:

90 92 94 96 98 100
 */
package week2.loopstatement.whileanddowhileloops;

import java.util.Scanner;
public class Exc1_whileloops {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
