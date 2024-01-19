/*
Task
Fill in the blank (...) to complete the program that prints all odd numbers from 1 to 100.
 */
package week2.loopstatement.whileanddowhileloops;


public class Exc6_continue_statement {
    	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
