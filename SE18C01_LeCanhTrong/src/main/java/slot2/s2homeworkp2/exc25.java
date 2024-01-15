/*
 Task
Given two integers a and b. Write a program that accepts the values of a and b from the user then displays the following line on the screen:

a % b = {P}
where {P} is the remainder when we divide a by b.

For example, if you enter two integers:

7 3
the program will produce the following result:

a % b = 1
Explanation: 7 modulo 3 is equal to 1
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc25 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a % b = " + (a - b * (a / b)));
	}
}
