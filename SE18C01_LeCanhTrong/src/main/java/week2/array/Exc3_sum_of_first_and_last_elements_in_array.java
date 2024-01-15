/*
Task
Write a program that accepts an array arr of n integers from the user and prints the sum of the first element and the last element in arr on the screen.

For example, if n = 5, arr = [2, 7, 6, 8, 9], enter the following values:

5
2 7 6 8 9
When the code is compiled and executed, it produces the following result:
11
 */
package week2.array;

import java.util.Scanner;
public class Exc3_sum_of_first_and_last_elements_in_array {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(arr[0] + arr[n - 1]);
	}
}
