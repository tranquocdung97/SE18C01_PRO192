/*
Task
Write a program to read the name and age of a random person then display the following line on the screen:

In 15 years, age of {P1} will be {P2}
With {P1} is the name and {P2} is the age of that person in 15 years.

For example, if you enter the following values:

Tuan 23
the screen will display as below:

In 15 years, age of Tuan will be 38
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc27 {
    	public static void main(String[] args) {
                System.out.println("input name:");
		Scanner sc = new Scanner(System.in);
                System.out.println("input age:");
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
	}
}
