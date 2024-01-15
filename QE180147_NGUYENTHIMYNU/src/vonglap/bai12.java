/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = 1;
        for (int i = 1; i <= b; i++) {
            d = d * a;
        }
        System.out.print(d);
    }
}
