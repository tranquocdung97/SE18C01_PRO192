/*
Task
Given a 2-dimensional array arr (n rows, m columns). Write a program that accepts arr from the user and calculates the sum of all elements in arr.

For example, if n = 2, m = 3, arr = [[5, 7, 3], [1, 2, 4]], enter the following values:

2 3
5 7 3
1 2 4
When the code is compiled and executed, it produces the following result:
22
 */
package week2.array;
import java.util.Scanner;

public class Exc9_2d_arrays {
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
				answer += arr[i][j];
			}
		}

		System.out.print(answer);
	}
}
