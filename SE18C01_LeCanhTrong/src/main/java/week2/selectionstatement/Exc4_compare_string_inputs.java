/*
Task
Write a program that accepts the names of two people from the user then checks whether these two names are the same or not.

If two names are the same, print the following line on the screen:

two people have the same name
If two names are different, print the following line on the screen:

two people don't have the same name
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc4_compare_string_inputs {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if (a.equals(b)) {
			System.out.println("two people have the same name");
		} else {
			System.out.println("two people don't have the same name");
		}
	}
}
