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
public class Slot2_Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n <= 100)
        {
            if (n % 2 == 0)
                System.out.print(n + " ");
            n++;
        }
    }
}
