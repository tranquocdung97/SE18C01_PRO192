/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_39 {
 //public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble ();
        if (a >= 0 && a <= 10 ) {
            System.out.println("The score is valid");
        }else {
            System.out.println("The score is not valid");
        }
	}
}