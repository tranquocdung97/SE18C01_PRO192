/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class bt59 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int [] a = new int [n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 1; i<n;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.print(max);
	}
}
