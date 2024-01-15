/*
Task
Write a program that accepts an array arr of n integers from the user and prints all even numbers in arr.

For example, if you enter the following values:

5
2 7 6 8 9
the code will produce the following result:

2 6 8 
 */
package week2.array;

import java.util.Scanner;
public class Exc4_display_even_numbers_in_array {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
