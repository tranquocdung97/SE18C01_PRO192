/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.loopstatement_while_do_while;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n <= 100) {
                if (n % 2 == 0) {
                        System.out.print(n + " ");
                }
                n += 1;
        }
    }
}
