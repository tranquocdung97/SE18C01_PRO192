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
public class BT8 {

    public static int sumOfArray(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr, n));
    }
}
