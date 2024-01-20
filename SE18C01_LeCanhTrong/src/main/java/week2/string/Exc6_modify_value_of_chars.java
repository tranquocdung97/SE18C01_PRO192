/*
Task
Given a string s, write a program that accepts s from the user and prints uppercase characters in s on the screen.

Example

For s = "CodeLearn", the output should be 2.
Because there are 2 uppercase characters in s.
For s = "ABC123", the output should be 3.
 */
package week2.string;

import java.util.Scanner;
public class Exc6_modify_value_of_chars {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
