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
public class bai65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr= new int[n];
        for( int i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( int i=0; i<n;i++)
        {
            if(0<=arr[i] && arr[i]<=10)
                System.out.print(arr[i]+" ");
        }
    }
}
