/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_66 {
 //public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int count = 0 ; 
		for (int i = 0 ; i < s.length() ; i ++){
            if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ){
                count++ ;
            }
        }System.out.print(count);
	}
}