/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops_while_and_do_while;

/**
 *
 * @author Ho Phi Hung
 */    import java.util.Scanner;

public class Baitap_bosung_76_ {

//public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 100) {
            if ( n % 2 == 0 ){
                System.out.print( n + " ");    
            }
            n++ ; 
			
		}
	}
}

