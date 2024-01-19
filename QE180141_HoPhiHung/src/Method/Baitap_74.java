/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_74 {
 //public class Method {
	public static int sum(int n) {
		if (n == 1) return 1;
	    if (n % 2 == 0) {
	        return sum(n-1);
	    } else {
	    	return n + sum(n-1);
	    }
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sum(n));
	}
}