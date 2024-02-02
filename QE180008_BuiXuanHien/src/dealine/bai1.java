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

//    public static int digit(long n) {
//        String str = String.valueOf (n);
//        if (n.length() > 12) {
//            return 0;
//        }
//        int sum = n[1];
//        for(int i=0;i<n.length();i++){
//            
//        }               
//        if (n.length() % 2 != 0) {    
//            return 10 - sum % 10;   
//        }
//        return sum - ((int) (sum / 10)) * 10; 
//    }
}


public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("" + digit(n));
    }
}
