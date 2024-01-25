/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Arrays;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for( int i=0;i<n;i++ ){
            arr[i]= sc.nextInt();
        }
        int sum =0;
        int i = 0;
        while( i<n ){
            if(arr[i]%2 != 0 && arr[i]>0){
                sum += arr[i];
            }
            i++;
        }
        System.out.println(sum);
    }
}
