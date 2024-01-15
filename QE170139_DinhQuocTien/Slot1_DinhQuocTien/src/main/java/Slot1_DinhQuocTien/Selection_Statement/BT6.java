/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot1_DinhQuocTien.Selection_Statement;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
