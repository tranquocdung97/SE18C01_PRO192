/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class bt48 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
        int tich = 1;
        for(int i = 1; i<= a; i++){
            tich *= i;
        }
        System.out.print(tich);
	}  
}
