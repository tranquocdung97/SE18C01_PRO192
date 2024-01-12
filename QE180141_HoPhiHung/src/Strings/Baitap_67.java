/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_67 {
 //public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = "";
        for (int i = s.length() -1; i >= 0 ; i --){
            a += s.charAt(i);
        }System.out.print( a );
	}
}