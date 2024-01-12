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
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int answer = 0;
        while (i <= n) {
            if (n % i == 0) {
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}
