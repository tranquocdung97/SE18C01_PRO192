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
public class bai68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(), m=sc.nextInt(), s=0;
        int[][] arr = new int[n][m];
        for( int i=0;i<n;i++)
        {
            for(int u=0;u<m;u++)
            {
                arr[i][u]=sc.nextInt();
            }
        }
        for( int i=0;i<n;i++)
        {
            for(int u=0;u<m;u++)
            {
               if(arr[i][u]%5==0)
                s=s+arr[i][u];
            }

        }
        System.out.print(s);
    }
}
