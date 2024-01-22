
import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CL_w1_BT58 {

    public static void main(String[] args) {
        int i = 1;
        i = i + 9;
        do {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
            i = i + 10;
        } while (i <= 1000);
    }
}
