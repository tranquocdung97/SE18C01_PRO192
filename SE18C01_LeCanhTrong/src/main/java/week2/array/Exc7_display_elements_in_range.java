/*
Task
Write a program that accepts an array arr of n integers from the user and prints all numbers which are greater than or equal to 0 and less than or equal to 10 in arr.

For example, if you enter the following values:

8
3 -7 2 5 9 -6 10 12
the code will produce the following result:

3 2 5 9 10 
 */
package week2.array;

import java.util.Scanner;
public class Exc7_display_elements_in_range {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0 && arr[i] <= 10) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
