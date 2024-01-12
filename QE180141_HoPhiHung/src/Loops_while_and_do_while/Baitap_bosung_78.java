/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loops_while_and_do_while;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_bosung_78 {
//public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt (), b = sc.nextInt (), m = 1;
        for( int i = 1  ; i <= b ; i ++ ){
            m*= a ;
        }System.out.print(m);
	}
}