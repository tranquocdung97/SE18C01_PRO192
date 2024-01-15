/*
Task
Given a two-dimensional array arr (n rows, m columns) of integers. Write a program that accepts arr from the user and calculates the sum of numbers in arr, which are divisible by 5.

For example, if n = 3, m = 4, arr = [[10, 4, 8, 2], [5, 6, 4, 9], [20, 3, 8, 1]], enter the following values:

3 4
10 4 8 2
5 6 4 9
20 3 8 1
When the code is compiled and executed, it produces the following result:

35
Because the sum of elements divisible by 5 in arr is: 10 + 5 + 20 = 35.
 */
package week2.array;

import java.util.Scanner;
public class Exc10_2d_arrays_p2 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] % 5 == 0) {
					answer += arr[i][j];
				}
			}
		}
		System.out.print(answer);
	}
}
