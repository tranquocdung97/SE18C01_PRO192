/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packages2;

import java.util.Scanner;

/**
 *
 * @author XUAN HIEN
 */
public class bai66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (a[j] >= 0 && a[j] <= 10) {
                System.out.print(a[j] + " ");
            }
        }
    }
}
