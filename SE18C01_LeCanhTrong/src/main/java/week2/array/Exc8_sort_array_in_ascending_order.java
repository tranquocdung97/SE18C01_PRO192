/*
Task
Write a program that accepts an array arr of n integers from the user and sorts all elements in ascending order and print the sorted array on the screen.

For example, if n = 6, arr = [5,3,2,6,7,7], enter the following values:

6
5 3 2 6 7 7
When the code is compiled and executed, it produces the following result:

2 3 5 6 7 7
 */
package week2.array;
import java.util.Scanner;
public class Exc8_sort_array_in_ascending_order {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
