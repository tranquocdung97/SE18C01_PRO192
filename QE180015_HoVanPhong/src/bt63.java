/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class bt63 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int s = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > 0 && a[i]%2!= 0){
                s = s+a[i];
            }
        }
        System.out.print(s);
	}
}
