/*
Task
Write a method to return the largest number among 3 numbers which are entered from the user.

Example

If you enter 3 numbers: 6, 2, 8, the output should be 8.
If you enter 3 numbers: 4, 4, 4, the output should be 4.
 */
package week2.method;

import java.util.Scanner;
public class Exc4_Return_largest_num {
    	public static int max3(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		}
		if(b >= c) {
			return b;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
}
