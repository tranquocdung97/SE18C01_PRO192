/*
Task
Write a program that accepts the radius r of a circle from the user then displays the circumference of that circle knowing that π = 3.14:

Circumference = {P}
Where {P} is the circumference of a circle with radius r.

For example, if you input the following value:

7.5
the code will produce the following result:
Circumference = 47.1
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc29 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = 3.14;
		System.out.println("Circumference = " + (2 * pi * r));
	}
}
