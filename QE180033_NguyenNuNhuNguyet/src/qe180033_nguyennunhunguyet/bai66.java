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
public class bai66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), t;
        int[]arr=new int[n];
        for( int i=0 ; i<n ;i++)
        {
            arr[i]= sc.nextInt();
        }
        for( int i=0 ; i<n ;i++)
        {
            for( int u=i+1; u<n ; u++)
            {
                if( arr[i]> arr[u])
                {

                t=arr[i];
                arr[i]= arr[u];
                arr[u]=t;
                }
            }
        }
        for(int i=0 ; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
