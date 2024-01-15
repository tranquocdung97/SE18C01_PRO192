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
public class Slot2_Exercise7 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
        if (a >= 10 && a <= 100) System.out.println(a + " is in the range [10, 100]");
        else System.out.println(a + " is not in the range [10, 100]");
    }
}
