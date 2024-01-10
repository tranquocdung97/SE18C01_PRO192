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
public class BT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
