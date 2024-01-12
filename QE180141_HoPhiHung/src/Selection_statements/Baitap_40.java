/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_40 {
  //public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt (), b = sc.nextInt (), c = sc.nextInt ();
        if (a <= b && b <= c){
            System.out.println("increasing");
        }else if (a > b && b > c) {
            System.out.println("decreasing");
        }else {
            System.out.println("neither increasing nor decreasing order");
        }
	}
}