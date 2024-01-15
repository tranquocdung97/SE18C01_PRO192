/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai6 {

    public static int factorial(int n) {
        int s = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            s = s * i;
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}
