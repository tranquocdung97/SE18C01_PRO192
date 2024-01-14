/*
Task
Write a program that accepts two integers a and b from the user then checks whether both a and b are not equal to zero or not. 
If two values are not equal to 0, print the following line on the screen:

a is not equal to 0 and b is not equal to 0
If a or b is equal to 0, print the following line on the screen:

a is equal to 0 or b is equal to 0
 */
package week2.selectionstatement;

import java.util.Scanner;


public class Exc5_compare_variables_to_zero {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	    if (a != 0 && b != 0) {
	        System.out.println("a is not equal to 0 and b is not equal to 0");
	    } else {
	    	System.out.println("a is equal to 0 or b is equal to 0");
	    }
	}
}
