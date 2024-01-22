/*
Task
Write a method that accepts an array arr of integers and returns the sum of all elements in arr on the screen.

Example

For n = 3, arr = [2, 4, 1], the output should be 7.
For n = 4, arr = [2, 2, 3, 4], the output should be 11.
 */
package week2.method;

import java.util.Scanner;
public class Exc1_sum_of_elements {
    	public static int sumOfArray(int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sumOfArray(arr));
	}
}
