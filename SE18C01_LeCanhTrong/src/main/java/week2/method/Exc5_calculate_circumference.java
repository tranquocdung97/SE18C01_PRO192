/*
Task
Given a circle with a radius r. Write a program to return its circumference, knowing that π = 3.14.

For example, if you enter the following value:

3.5
the code will produce the following result:

21.98
 */
package week2.method;

import java.util.Scanner;
public class Exc5_calculate_circumference {
    	public static double circumference(double r) {
		return 2 * r * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
	}
}
