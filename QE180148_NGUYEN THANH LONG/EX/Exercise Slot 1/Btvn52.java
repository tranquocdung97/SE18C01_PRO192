/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;

/**
 *
 * @author Admin
 */
public class Btvn52 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 1;
        for (int i = 1; i <= b; i++)
        {
            s=s*a;
        }
        System.out.println(s);
	}    
}
