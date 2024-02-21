/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha;

/**
 *
 * @author admin
 */
public class baitap47 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        System.out.print(answer);
	}
}
