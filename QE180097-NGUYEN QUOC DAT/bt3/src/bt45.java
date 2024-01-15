/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class bt45 {
    	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = 0;
        for(int i = a; i <= b; i++){
            tong += i;
        }
         System.out.println(tong);
	}
}
