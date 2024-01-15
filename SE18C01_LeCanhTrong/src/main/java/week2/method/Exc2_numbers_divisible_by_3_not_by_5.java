/*
Task
Write a method that accepts an array arr of integers from the user and displays numbers, which are divisible by 3 but not divisible by 5 in arr, on the screen.

Example:

For n = 4, arr = [3, 7, 15, 18], the output should be as below:
3 18 ​
For n = 5, arr = [30, 20, 21, 15, 30], the output should be as below:
21 ​
 */
package week2.method;

import java.util.Scanner;

public class Exc2_numbers_divisible_by_3_not_by_5 {
    	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		show(arr);
	}
}
