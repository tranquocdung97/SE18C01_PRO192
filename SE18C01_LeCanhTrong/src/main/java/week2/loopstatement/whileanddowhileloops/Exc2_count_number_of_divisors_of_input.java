/*
Task
Write a program that accepts an integer n from the user then prints all divisors of n on the screen.

For example, if n = 12 , the program produces the following result:

6
Because all divisors of 12 are 1, 2, 3, 4, 6, 12
 */
package week2.loopstatement.whileanddowhileloops;

import java.util.Scanner;
public class Exc2_count_number_of_divisors_of_input {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int answer = 0;
		while(i <= n) {
			if(n % i == 0) {
				answer++;
			}
			i++;
		}
		System.out.println(answer);
	}
}
