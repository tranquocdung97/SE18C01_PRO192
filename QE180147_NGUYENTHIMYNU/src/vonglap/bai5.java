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
public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
