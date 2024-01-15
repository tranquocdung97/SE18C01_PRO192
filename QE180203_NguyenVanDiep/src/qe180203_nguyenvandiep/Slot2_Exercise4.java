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
public class Slot2_Exercise4 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next(), b = sc.next();
        if (a.equals(b)) System.out.println("two people have the same name");
        else System.out.println("two people don't have the same name");
    }
}
