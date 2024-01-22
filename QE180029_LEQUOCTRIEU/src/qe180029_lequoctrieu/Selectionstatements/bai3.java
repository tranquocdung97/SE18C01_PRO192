/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Selectionstatements;

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
        if(a >= b){
            System.out.println("a is greater than or equal to b");
        } else{
            System.out.println("a is smaller than b");
        }
    }
}
