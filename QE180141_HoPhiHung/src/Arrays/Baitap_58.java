/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_58 {
//public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt () ; 
        int[] arr = new int[n] ;// arr1 = new int [ n ]; 
        for (int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt() ; 
        }
        for (int i = 0 ; i < n ; i ++){
            for (int j = i+1 ; j < n ; j++)
            {if ( arr[i] > arr[j ]){
                int temp = arr[i] ; 
                arr[i] = arr[j ];
                arr[j] = temp;
            }}
        }for (int i = 0 ; i < n ; i ++){
            System.out.print(arr[i] + " ");
        }

	}
}