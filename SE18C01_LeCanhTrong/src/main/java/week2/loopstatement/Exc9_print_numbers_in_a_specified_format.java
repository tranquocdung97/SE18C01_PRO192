/*
Task
Write a program that prints numbers from 0 to 24 (including 0 and 24) as below:

0 1 2 3 4 
5 6 7 8 9 
10 11 12 13 14 
15 16 17 18 19 
20 21 22 23 24 
 */
package week2.loopstatement;
import java.util.Scanner;
public class Exc9_print_numbers_in_a_specified_format {
    	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i * 5 + j + " ");
			}
			System.out.println();
		}
	}
}
