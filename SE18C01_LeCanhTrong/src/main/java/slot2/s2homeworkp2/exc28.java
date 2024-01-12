/*
Task
Given two integer values a and b. Write a program that accepts a and b from the user and swaps the value of a and b then prints the following line on the screen:
after swapping, a = {P1}, b = {P2}
where {P1} is the value of a after swapping and {P2} is the value of b after swapping.

For example, if a = 3 and b = 4, we enter the following values:

3 4
When the code is compiled and executed, it produces the following result:
after swapping, a = 4, b = 3
*/
package slot2.s2homeworkp2;
import java.util.Scanner;


public class exc28 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("after swapping, a = " + a + ", b = " + b);
	}
}
