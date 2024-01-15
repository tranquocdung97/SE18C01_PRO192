/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2.loopstatement.whileanddowhileloops;


public class Exc5_break_statement {
    	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i == 51) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}
