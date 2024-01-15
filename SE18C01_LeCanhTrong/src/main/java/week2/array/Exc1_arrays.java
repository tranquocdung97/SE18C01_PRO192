/*
Task
Write a program that accepts 10 integers from the user and prints those entered numbers on the screen.

For example, if you enter the following numbers:

2 7 6 3 4 8 9 7 6 10
the program will produce the following result:

2 7 6 3 4 8 9 7 6 10
 */
package week2.array;
import java.util.Scanner;
public class Exc1_arrays {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
