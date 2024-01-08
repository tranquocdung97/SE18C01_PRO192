/*
Task
Write a program that accepts your name from the keyboard then displays the below text on the screen:

Hello {P}
where {P} is your name entered from the keyboard.

For example, if your name is Trung, the program will produce the following result on the screen:

Hello Trung
 */

package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc21 {
    	public static void main(String[] args) {
                System.out.println("input name: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello " + sc.next());
	}
}
