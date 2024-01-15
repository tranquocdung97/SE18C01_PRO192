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
public class Slot2_Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 0;
        for (int i = 1; i <= n; i++)
            if(n % i == 0) div++;
        System.out.println(div);
    }
}
