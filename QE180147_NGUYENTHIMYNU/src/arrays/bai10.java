/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mang;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] % 5 == 0) {
                    s += a[i][j];
                }
            }
        }
        System.out.print(s);
    }
}
