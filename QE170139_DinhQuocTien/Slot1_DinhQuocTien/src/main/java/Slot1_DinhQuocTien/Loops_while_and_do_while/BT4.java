/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot1_DinhQuocTien.Loops_while_and_do_while;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a <= b) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
