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
public class bai4 {
    public static int max3(int a,int b,int c){
        if(a >= b && a >= c) {
			return a;
		}else{
            if(b >= c && b>=a ) {
			    return b;
		    }else{
                return c;
            }
		
        }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
}
