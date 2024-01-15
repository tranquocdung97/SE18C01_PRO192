/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_64 {
    //public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        System.out.print(s1.indexOf(s2));
	}
}
