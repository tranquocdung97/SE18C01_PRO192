/*
Task
Write a program that reads a character from the user then displays the next character of the given character (in the English alphabet) on the screen.

For example, if you enter:

c
the screen will display:

d
Explanation: 'd' is the next character of 'c' in the alphabet.
 */
package slot2.s2homeworkp2;
    import java.util.Scanner;

public class exc30 {

    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = (char)(sc.next().charAt(0) + 1);
		System.out.println(c);
	}
}
