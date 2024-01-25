/*
Task
Write a program that accepts a string s from the user and displays non-numeric characters in s on the screen.

Example

For s = "Codel9a83rn", the output should be "Codelearn"
For s = "black7cat", the output should be "blackcat"
Suggestion: Use replace() method to replace numeric characters in s.
 */
package week2.string;

import java.util.Scanner;
public class Exc5_count_uppercase_chars {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(char c = '0'; c <= '9';c++) {
			s = s.replace(c + "", "");
		}
		System.out.println(s);
	}
}
