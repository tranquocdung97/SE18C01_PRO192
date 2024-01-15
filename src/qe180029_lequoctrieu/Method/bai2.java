/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180029_lequoctrieu.Method;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class bai2 {
    public static void show(int[] arr){ // khai bao ham thuoc kieu void ten show 
        for( int i =0; i<arr.length; i++){ // arr.leghth chieu dai cua mang arr
            if(arr[i]% 3 ==0 && arr[i] % 5 !=0){
                System.out.print(arr[i] + " ");
            }
        }  
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		show(arr);
	}
}
