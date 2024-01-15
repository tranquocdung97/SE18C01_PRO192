/*
Task
Write a program that accepts an array arr of n integers from the user and prints the sum of all odd numbers which are greater than 0 in the array.

For example, if you enter the following values:

8
3 -7 2 5 9 -6 10 12
the code will produce the following result:

17
Because 3 + 5 + 9 = 17.
 */
package week2.array;

import java.util.Scanner;
public class Exc6_calculate_sum_of_elements_with_values_greater_than_zero {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] % 2 != 0 && arr[i] > 0) {
				answer += arr[i];
			}
		}
		System.out.print(answer);
	}
}
