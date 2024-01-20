/*
Task
Given a string s. Write a program that accepts s from the user and reverses s. Display the reversed string on the screen.

Example

For s = "Codelearn", the output should be "nraeledoC"
For s = "ABC", the output should be "CBA"
 */
package week2.string;

import java.util.Scanner;
public class Exc7_display_chars_from_A_to_Z {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			answer += s.charAt(i);
		}
		System.out.print(answer);
	}
}
