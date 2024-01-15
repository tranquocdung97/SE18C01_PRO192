/*
Task
Write a program that accepts the values of two integers a and b from the user then displays the results of the following operations:

a + b = {P1}
a - b = {P2}
a * b = {P3}
a / b = {P4}
a % b = {P5}
Where:

{P1} is the sum of a and b.

{P2} is the difference between a and b.

{P3} is the product of a and b.

{P4} is the quotient of a and b.

{P5} is the remainder when we divide a by b.

For example, if you input the following values:

10 5
the code will produce the following result:

a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc26 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
	}
}
