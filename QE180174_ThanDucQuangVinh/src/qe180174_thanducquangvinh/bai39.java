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
public class bai39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 0 && score <= 10) {
            System.out.println("The score is valid");
        } else {
            System.out.println("The score is not valid");
        }
    }
}
