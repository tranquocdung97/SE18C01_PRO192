/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha;

/**
 *
 * @author admin
 */
public class baitap38 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
        if (score < 0 || score >10) {
            System.out.println("The score is not valid");
        } else {
            System.out.println("The score is valid");
        }
	}
}
