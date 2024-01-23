
import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CL_w1_BT71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = sc.next().charAt(0);
        int c = -1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                c = i;
                break;
            }
        }
        System.out.print(c);
    }
}
