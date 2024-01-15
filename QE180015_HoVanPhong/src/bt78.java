/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class bt78 {
    public static int max3(int a, int b, int c){
        int max = 0;
        if(max < a) max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        return max;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.print(max3(a, b, c));
	}
}
