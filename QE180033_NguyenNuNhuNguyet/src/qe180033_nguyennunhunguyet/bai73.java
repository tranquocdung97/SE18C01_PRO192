/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet;

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;
public class bai73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(char c='0'; c<='9';c++)
        {
            s=s.replace(c+"", "");
        }
        System.out.print(s);
    }
}
