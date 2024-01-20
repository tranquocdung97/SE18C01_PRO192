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
public class bai1 {
    public static int sumOfArray(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){  //arr.length tinh do dai cua mang
        sum +=arr[i];
        }
        return sum;
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
