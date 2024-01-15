/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Selectionstatements;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
        String name2 = sc.next();
        if(name1.equals(name2) ){ //ham equals phuong thuc so sanh 2 chuoi neu bang nhau tra ve true khong thi tra ve false 
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
	}
}
