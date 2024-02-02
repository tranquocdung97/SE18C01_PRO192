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
public class bai59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int [10];
        for(int i = 0 ; i<10 ; i++)
        {
            a[i]= sc.nextInt();
        }
        for(int h = 0 ; h<10 ; h++)
        {
            System.out.print(a[h]+" ");
        }
    }
}
