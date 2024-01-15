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
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String kq = "";//khai bao chuoi kq 
        for(int i= s.length() - 1; i>=0 ;i-- ){
            kq += s.charAt(i);
        }
        System.out.print(kq);
    }
}
