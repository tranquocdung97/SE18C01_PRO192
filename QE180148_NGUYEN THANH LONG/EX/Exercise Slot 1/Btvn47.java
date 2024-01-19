/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Btvn47 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;
        for (int i = 1; i <=n ; i++)
        {
            s=s*i;
        }
        System.out.print(s);

	} 
}
