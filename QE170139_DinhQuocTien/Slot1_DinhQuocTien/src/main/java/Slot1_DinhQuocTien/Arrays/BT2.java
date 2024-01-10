/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slot1_DinhQuocTien.Arrays;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.print(maxValue);
    }
}
