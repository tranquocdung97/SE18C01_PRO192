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
public class bai54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        for( int i=a ; i<=b; i++)
        {
            if ( i%3==0 && i%5==0)
               System.out.print(i +" ");
        }
    }
}
