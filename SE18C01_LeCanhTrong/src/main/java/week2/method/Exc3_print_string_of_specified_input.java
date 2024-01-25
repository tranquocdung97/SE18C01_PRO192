/*
Task
Write a method to print strings of length greater than 3 in an array arr.

Example

For n = 3, arr = ["abcd", "ab", "xyz"], the output should be as below:
abcd​
For n = 4, arr = ["1234", "abcde", "xy", "code"], the output should be as below:
1234 abcde code​
 */
package week2.method;

import java.util.Scanner;
public class Exc3_print_string_of_specified_input {
    	public static void show(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 3) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		show(arr);
	}
}
