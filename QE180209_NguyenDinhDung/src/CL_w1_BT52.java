
import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CL_w1_BT52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                c = c + 1;
            }
        }
        System.out.println(c + 1);
    }
}
