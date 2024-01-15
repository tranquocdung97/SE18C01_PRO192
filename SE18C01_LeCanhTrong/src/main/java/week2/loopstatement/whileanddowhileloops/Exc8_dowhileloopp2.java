/*
Task
Write a program to print all numbers from 1 to 1000 (including 1 and 1000), which end with 0. It means the program will display 10, 20, 30, ..., 990, 1000 on the screen.
 */
package week2.loopstatement.whileanddowhileloops;


public class Exc8_dowhileloopp2 {
    	public static void main(String[] args) {
	    int i = 1;
	    do {
	    	if(i % 10 == 0) {
	    		System.out.print(i + " ");
	    	}
	    	i++;
	    } while (i <= 1000);
	}
}
