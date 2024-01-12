/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine ();
        String b = sc.nextLine ();
        if (a.equals(b)){
            System.out.println("two people have the same name");
        }else {
            System.out.println("two people don't have the same name");
        }
	}
}