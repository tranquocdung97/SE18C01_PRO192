/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180174_thanducquangvinh;

import java.util.Scanner;

/**
 *
 * @author HOANG KHUONG
 */
public class bai35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println(" two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
    }
}
