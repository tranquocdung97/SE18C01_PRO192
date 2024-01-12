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
public class BT7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 10 && a <= 100) {
            System.out.println(a + " is in the range [10, 100]");

        } else {
            System.out.println(a + " is not in the range [10, 100]");
        }

    }
}
