/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Arrays;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];//khai bao 2 mang 
        for (int i = 0; i < n; i++) {//nhap cac phan tu vao 2 mang
                for (int j = 0; j < m; j++) {
                        arr[i][j] = sc.nextInt();
                }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                        answer += arr[i][j];
                }
        }

        System.out.print(answer);
    }
}
