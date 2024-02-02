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
public class bai47 {
    public static void main(String[] args)
    {
        Scanner c = new Scanner(System.in);
        int a=c.nextInt(),b=c.nextInt();
        for(int i =a ; i<=b ; i++)
        {
            if( i%3==0)
               System.out.print(i+" ");
        } 
    }
}
