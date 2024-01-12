/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops_while_and_do_while;

/**
 *
 * @author Ho Phi Hung
 */
public class Baitap_bosung_81 {
 //public class Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0  ){
                continue ; 
            }
			System.out.print(i + " ");
		}
	}
}