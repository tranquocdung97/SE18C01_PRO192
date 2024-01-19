/*
Task
Write a program that accepts the test score of a student (knowing that the valid score is greater than or equal to 0 and less than or equal to 10) from the user and checks whether the entered score is valid or not.

If the score is valid, print the following line on the screen:

The score is valid
If the score is invalid, print the following line on the screen:

The score is not valid
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc8_check_validity_of_entered_grades {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 0 && score <= 10) {
			System.out.println("The score is valid");
		} else {
			System.out.println("The score is not valid");
		}
	}
}
