/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_62 {
 //public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        char c = sc.next().charAt(0);
        int a = 0 ;
        for (int i = 0 ; i < s.length() ; i ++ ){
            if (  s.charAt(i)== c ){
                a++;
            }

        }System.out.print(a);
	}
}