/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class bt77 {
    	public static int sumOfArray(int[] arr) {
		int ketqua= 0;
        for(int i = 0; i<arr.length; i++){
            ketqua += arr[i];
        }
          return ketqua;
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
