/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUYNH THAO
 */
import java.util.Scanner;

public class bt55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] % 2 != 0 && arr[i] > 0) {
				answer += arr[i];
			}
		}
		System.out.print(answer);
	}
}
