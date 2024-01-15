/*
Task
Write a program that accepts two integers a and b from the user then prints the result of ab on the screen.

For example, if a = 2, b = 3, the program will produce the following result:

8
Because 2 * 2 * 2 = 8.
 */
package week2.loopstatement.whileanddowhileloops;

import java.util.Scanner;
public class Exc3_Calculate_exponentation {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 1;
		for (; b > 0; b--) {
			answer *= a;
		}
		System.out.print(answer);
	}
}
