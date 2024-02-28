/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javafundamentals;

/**
 *
 * @author admin
 */
public class baitap31 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("n is an even number");
        }
        if (n % 2 != 0) {
            System.out.println("n is an odd number");
        }
	}
}
