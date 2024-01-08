/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qe180203_nguyenvandiep;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Slot1_Exercise26 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
	}
}
