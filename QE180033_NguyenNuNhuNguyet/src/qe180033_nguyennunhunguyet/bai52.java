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
public class bai52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), s=0;
        for(int i=1 ; i<=n ; i++)
        {
            if(n%i==0)
                s++;
        }
        System.out.println(s);

   }
}
