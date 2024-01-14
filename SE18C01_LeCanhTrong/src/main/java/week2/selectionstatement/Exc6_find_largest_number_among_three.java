/*
Task
Write a program that accepts three integers from the user and prints the biggest number among them on the screen.

For example, if you enter three numbers as below:

4 7 3
the code will produce the following result:
7
If you enter three numbers as below:

4 4 4
the code will produce the following result:
4
 */
package week2.selectionstatement;

import java.util.Scanner;


public class Exc6_find_largest_number_among_three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}
    
}
