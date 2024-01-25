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
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
            for(int i=0;i < s.length();i++){
        if(s.charAt(i) >='A' && s.charAt(i)<='Z'){
            sum++;
        }
    }
    System.out.print(sum);
    }
}

