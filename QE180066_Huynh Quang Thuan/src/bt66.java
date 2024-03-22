/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HUYNH THAO
 */
import java.util.Scanner;

public class bt66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			answer += s.charAt(i);
		}
		System.out.print(answer);
	}
}
