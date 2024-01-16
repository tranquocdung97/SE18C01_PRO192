
import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CL_w1_BT70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char d = sc.next().charAt(0);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == d) {
                c++;
            }
        }
        System.out.print(c);
    }
}
