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
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i=0;i<10; i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
