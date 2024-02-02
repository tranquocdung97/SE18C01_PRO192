/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet;

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;
public class bai70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        int u=0;
        for( int i=0; i<s.length(); i++)
        {
            if( s.charAt(i)==c)
              u++;
        }
        System.out.print(u);

    }
}
