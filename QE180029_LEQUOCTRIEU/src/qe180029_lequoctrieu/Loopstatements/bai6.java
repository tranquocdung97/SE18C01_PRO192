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
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        for(int i=a; i<=b;i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
