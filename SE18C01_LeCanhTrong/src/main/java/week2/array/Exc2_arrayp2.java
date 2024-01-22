/*
Task
Write a program that accepts an array arr of n integers from the user and prints the largest element in the array.

For example, if n = 5, arr = [2, 7, 6, 8, 9], enter the values as below:

5
2 7 6 8 9
When the code is compiled and executed, it produces the following result
9
Explanation: this array contains 5 elements and 9 is the largest one in the array.
 */
package week2.array;

import java.util.Scanner;
public class Exc2_arrayp2 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxValue = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}

		System.out.print(maxValue);
	}
}
