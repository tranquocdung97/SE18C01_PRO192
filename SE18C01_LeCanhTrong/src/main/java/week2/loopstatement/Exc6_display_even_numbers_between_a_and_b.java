/*
Task
Write a program that accepts two integers a and b from the user and prints all the numbers from a to b, which are divisible by 3:

For example, if a = 1, b = 20, the program will produce the following result:

3 6 9 12 15 18
 */
package week2.loopstatement;
import java.util.Scanner;

public class Exc6_display_even_numbers_between_a_and_b {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
