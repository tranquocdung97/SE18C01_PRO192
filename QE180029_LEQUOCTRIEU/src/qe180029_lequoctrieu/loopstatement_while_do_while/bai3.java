/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.loopstatement_while_do_while;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s =1;
        for(int i=b;i>0;i-- ){
            s=s*a;
        }
        System.out.println(s);
    }
}
