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
public class BT5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
