/*
ask
Write a program that accepts two integer variables a and b from the user then displays the text below on the screen:

a + b = {P}
where {P} is the sum of a and b.

For example, if you enter the following information:

7 9
The program will produce the following result:
a + b = 16
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc23 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a + b = " + (a + b));
	}
}
