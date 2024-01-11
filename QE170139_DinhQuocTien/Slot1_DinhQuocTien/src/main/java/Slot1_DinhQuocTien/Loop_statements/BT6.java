/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot1_DinhQuocTien.Loop_statements;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
