/*
Task
Write a program that accepts an integer a from the user then checks whether a is in the range [10, 100] or not.

If a is in the range [10, 100], print the following line on the screen:

{P} is in the range [10, 100]
If a is not in the range, print the following line on the screen:

{P} is not in the range [10, 100]
where {P} is the value of a.

Note: if x is in the range [10, 100], it means 10 ≤ x ≤ 100.

For example, if you enter the following value:

55
the code will produce the following result:

55 is in the range [10, 100]
 */
package week2.selectionstatement;

import java.util.Scanner;

public class Exc7_check_number_whether_it_is_within_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 10 && a <= 100) {
			System.out.println(a + " is in the range [10, 100]");
		} else {
			System.out.println(a + " is not in the range [10, 100]");
		}
	}
}
