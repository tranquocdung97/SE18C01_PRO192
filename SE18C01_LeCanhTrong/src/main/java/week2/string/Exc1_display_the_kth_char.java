/*
Task
Given a string s and an integer k. Write a program that accepts these two variables from the user and prints the k'th character in s.

For example, if s = "Codelearn", k = 2, enter the following values:

Codelearn
2
the screen will display as below:

o
Because the 2nd character in Codelearn is o
 */
package week2.string;

import java.util.Scanner;
public class Exc1_display_the_kth_char {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		System.out.print(s.charAt(k - 1));
	}
}
