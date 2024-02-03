/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so n (1-10): ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(" "+continuedFraction(a));
    }
    
    private static int continuedFraction(int[] a){
        int tu = 1;
        int mau=1;
        for(int n = a.length;0<n;n--){
            tu = a[n]*a[n-1] + mau;
            mau = a[n];
        }
        int uoc = findGCD(tu,mau);
        int kq = (tu/uoc)*(mau/uoc);
        return kq;
    }
    
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
