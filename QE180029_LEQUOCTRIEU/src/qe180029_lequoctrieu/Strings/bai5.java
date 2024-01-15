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
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for( char c = '0';c <= '9';c++){
        s = s.replace(c + "","");
        }
        System.out.println(s);
    }
}
