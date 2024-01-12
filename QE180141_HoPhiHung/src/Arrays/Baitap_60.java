/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_60 {
//public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ; 
        int m = sc.nextInt() ;
        int[][] arr = new int[n][m]; 
        for (int i =  0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j ++ ){
                arr[i][j] = sc.nextInt() ;  
            }
        }int sum = 0 ; 
        for (int i =  0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j ++ ){
                if (arr[i][j] % 5 == 0 ){
                    sum+= arr[i][j];
                }
            }
        }System.out.print( sum );

        
	}
}