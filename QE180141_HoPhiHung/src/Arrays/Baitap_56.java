/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_56 {
  //public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; 
        int[] arr = new int[n] ; 
        for (int i = 0 ; i < n ; i ++ ){
            arr[i] = sc.nextInt () ; 
        }
        int sum = 0;
        for ( int i = 0 ; i < n ; i ++ ){
            if( arr[i] % 2 == 1 && arr[i] > 0 ){
                sum += arr[i];
            }
            }
        System.out.print(sum);
	}
}