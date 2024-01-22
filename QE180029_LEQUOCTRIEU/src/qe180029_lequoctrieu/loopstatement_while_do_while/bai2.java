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
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int s=0;
        while(i<=n){
            if( n % i == 0){
                s++;
            }
            i++;
        }
        System.out.println(s);
    }
}
