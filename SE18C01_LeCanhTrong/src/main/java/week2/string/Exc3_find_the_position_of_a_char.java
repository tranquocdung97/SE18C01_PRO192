/*
Task
Given a string s and a character c. Write a program that accepts these two variables from the user and finds the position of the first occurrence of c in string s. If character c does not appear in s, print -1.

For example, if s = "codelearn" and c = 'o', enter the following values:

codelearn o
When the code is compiled and executed, it produces the following result:

1
Because the first occurrence of 'o' is at position 1

If you enter the following values:

codewar z
When the code is compiled and executed, it produces the following result:

-1
Because 'z' does not appear in string "codewar".
 */
package week2.string;

import java.util.Scanner;
public class Exc3_find_the_position_of_a_char {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		int answer = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				/*
				 * Use break statement to terminate the loop because
				 * we had found the first occurence of c.
				 * If we don't use break statement, the program will produce
				 * the last position of c's occurence.
				 */
				answer = i;
				break;
			}
		}
		System.out.print(answer);
	}
}
