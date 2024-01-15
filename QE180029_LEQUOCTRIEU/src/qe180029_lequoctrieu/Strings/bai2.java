/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Strings;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   //mot chuoi nen dung string
        char a = sc.next().charAt(0);   //mot ky tu nen dung char, charAt(0) gan ky tu nhap vao vi tri 0 cua chuoi
        int sum =0;
        for( int i=0; i<s.length();i++){    //length() su dung de do do dai cua chuoi
            if(s.charAt(i) == a){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
