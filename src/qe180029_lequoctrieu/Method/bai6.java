/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Method;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai6 {
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}
