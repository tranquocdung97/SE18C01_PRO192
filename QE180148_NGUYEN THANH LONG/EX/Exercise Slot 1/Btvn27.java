/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btvn1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Btvn27 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a;
        a = b;
        b = c;
		System.out.println("after swapping, a = " + a + ", b = " + b);
	}
}
