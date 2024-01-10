/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot1_DinhQuocTien.Method;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT5 {

    public static double circumference(double r) {
        return 2 * r * 3.14;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print(circumference(r));
    }
}
