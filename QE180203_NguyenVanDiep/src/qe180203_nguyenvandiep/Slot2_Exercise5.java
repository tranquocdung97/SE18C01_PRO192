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
public class Slot2_Exercise5 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(), b = sc.nextInt();
        if (a != 0 && b != 0) System.out.println("a is not equal to 0 and b is not equal to 0");
        else System.out.println("a is equal to 0 or b is equal to 0");
    }
}
