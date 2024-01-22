/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qe180203_nguyenvandiep;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Slot2_Exercise43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                b++;
        System.out.print(b);
    }
}
