/*
Task
Write a program that accepts an integer n from the user then checks whether n is an even or odd number.

If n is an even number, print the following line:

n is an even number

If n is an odd number, print the following line:

n is an odd number

&&The code doesn't handle exceptions, just yet
 */
package week2.selectionstatement;
    import java.util.Scanner;

public class Exc1_if_else_statement {


	public static void main(String[] args) {
                System.out.println("input n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("n is an even number");
		} else {
			System.out.println("n is an odd number");
		}
	}
}

