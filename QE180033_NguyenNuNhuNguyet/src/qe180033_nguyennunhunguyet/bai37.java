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
public class bai37 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt() , c =sc.nextInt();
        if ( a>b && a>c )
            System.out.println(a);
        if ( b>c && b>a )
            System.out.println(b);
        else
            System.out.println(c); 
    }
}
