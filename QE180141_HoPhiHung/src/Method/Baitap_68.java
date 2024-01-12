/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_68 {
   //public class Method {
	public static int sumOfArray(int[] arr) {
		int a = 0 ; 
        for (int i = 0 ; i <arr.length; i ++) {
            a += arr[i] ; 
        }return a ; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(sumOfArray(arr));
	}
}