/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qe180203_nguyenvandiep;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Slot2_Exercise8 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int score = sc.nextInt();
        if (score >= 0 && score <=10) System.out.println("The score is valid");
        else System.out.println("The score is not valid");
    }
}
