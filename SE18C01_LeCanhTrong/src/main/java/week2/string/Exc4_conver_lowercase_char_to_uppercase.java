/*
Task
Given two string s1 and s2. Write a program that prints the position of the first occurrence of s2 in s1 (uppercase and lowercase letters will be considered as the same letters)

Example

For s1 = "Codelearn", s2 = "LEARN", the output should be 4
Because string s2 appears at the 4th position in s1.
For s1 = "blackcat", s2 = "lack", the output should be 1.
 */
package week2.string;

import java.util.Scanner;
public class Exc4_conver_lowercase_char_to_uppercase {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		System.out.print(s1.indexOf(s2));
	}
}
