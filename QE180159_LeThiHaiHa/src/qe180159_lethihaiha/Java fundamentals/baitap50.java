/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha;

/**
 *
 * @author admin
 */
public class baitap50 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 100) {
			if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n += 1;
		}
	}
}
