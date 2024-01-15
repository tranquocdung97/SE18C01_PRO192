/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Loopstatements;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for( int i = 1;i <= n;i++){
            if(i%2 != 0){
                s= s+i;
            }
        }
        System.out.println(s);
    }
}
