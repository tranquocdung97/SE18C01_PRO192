/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_71 {
//public class Method {
	public static int max3 (int a , int b , int c ){
        int max = -99999 ; 
        if (a > max ){max = a;}
        if (b > max ){max = b;}
        if (c > max ){max = c;}
        return max ; 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
}