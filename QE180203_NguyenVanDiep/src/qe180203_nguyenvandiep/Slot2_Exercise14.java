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
public class Slot2_Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), s = 0;
        for (int i = a; i <= b; i++)
            s += i;
        System.out.println(s);    
    }
}
