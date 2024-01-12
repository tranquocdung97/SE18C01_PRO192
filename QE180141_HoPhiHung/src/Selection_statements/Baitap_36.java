/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_36 {
   
//public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() , b = sc.nextInt ( ) ;
        if (a != 0 && b != 0 ){
            System.out.println ("a is not equal to 0 and b is not equal to 0");
        }else {
            System.out.println("a is equal to 0 or b is equal to 0");
        }
	}
}