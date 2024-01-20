/*
Task
Write a program that accepts an integer n from the user and displays the result of n! on the screen.

For example, if n = 5, the program will display on the screen as below:

120
Because 1 * 2 * 3 * 4 * 5 = 120.
 */
package week2.loopstatement;
import java.util.Scanner;

public class Exc7_Calculate_n_factorial {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 1;
		for (int i = 1; i <= n; i++) {
			// answer *= i means answer = answer * i;
			answer *= i;
		}
		System.out.print(answer);
	}
}
