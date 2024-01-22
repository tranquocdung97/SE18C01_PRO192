/*
Task
Given a string s and a character c. Write a program that accepts these two variables from the user and prints the occurrences of character c in s.

For example, if s = "Codelearn", c = 'e', enter the following values:

Codelearn
e
When the code is compiled and executed, it produces the following result:
2
Because 'e' appears 2 times in "Codelearn"
 */
package week2.string;

import java.util.Scanner;
public class Exc2_count_the_occurrences_of_a_char {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				answer ++;
			}
		}
		System.out.print(answer);
	}
}
