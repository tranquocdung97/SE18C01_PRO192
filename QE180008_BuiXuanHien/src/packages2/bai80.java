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
public class bai80 {

    public static int max3(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(max3(a, b, c));
    }
}
