/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dealine;

import static dealine.digit.digit;
import java.util.Scanner;

/**
 *
 * @author XUAN HIEN
 */
class digit {

    public static int digit(int a[]) {
        if (a.length > 12) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += (a[i]*3);
            } else {
                sum += a[i];
            }
        }
        if (a.length % 2 != 0) {
            return 10 - sum % 10;
        }
        return sum - ((int) (sum / 10)) * 10;
    }
}

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        long b = n;
        do {
            count++;
            b /= 10;
        } while (b > 0);
        int a[] = new int[count];
        int j = count;
        do {
            a[j-1] = (int) (n % 10);
            n /= 10;
            j--;
        } while (n > 0);
        
        System.out.println("" + digit(a));
    }
}
