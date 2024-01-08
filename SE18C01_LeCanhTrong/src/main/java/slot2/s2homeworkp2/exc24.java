/*
 Task
Write a program that accepts the width and the height of a rectangle (the width and the height of this rectangle are integers) from the user then displays the following line on the screen:

Area = {P}
where {P} is the area of the rectangle.
 */
package slot2.s2homeworkp2;
import java.util.Scanner;


public class exc24 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		System.out.println("Area = " + (length * width));
	}
}
