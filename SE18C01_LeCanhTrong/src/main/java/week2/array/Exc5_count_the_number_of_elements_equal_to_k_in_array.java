/*
Task
Given an array arr of n integers and an integer k. Write a program that accepts these variables from the user and prints the number of elements in arr, which are equal to k.

For example, if n = 6, arr = [3, 8, 7, 8, 3, 3], k = 3, enter the following values:

6
3 8 7 8 3 3
3
When the code is compiled and executed, it produces the following result:

3
Explanation: there are 3 elements in the array that are equal to 3.
 */
package week2.array;

import java.util.Scanner;
public class Exc5_count_the_number_of_elements_equal_to_k_in_array {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		System.out.print(count);
	}
}
