/*
Task
Given two integer variables a and b. Write a program that accepts two given variables from the keyboard and displays true if a is greater than b or false if a is less than b.

For example, if a = 5, b = 4, enter the following values:

5 4
When the code is compiled and executed, it produces the following result:

true
If a = 3, b = 4, enter the following values:

3 4
When the code is compiled and executed, it produces the following result:

false
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc31 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a > b);
	}
}
