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
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("n is a positive number");
        }
        if (n < 0) {
            System.out.println("n is a negative number");

        }
        if (n == 0) {
            System.out.println("n is equal to 0");
        }

    }
}
