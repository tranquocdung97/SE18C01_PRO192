/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class bt36 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(max < a) max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        System.out.println(max);
	}
}
