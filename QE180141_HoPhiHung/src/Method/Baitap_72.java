/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_72 {
    //public class Method {
	public static double  circumference(double r){
        return r*3.14*2 ; 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.print(circumference(r));
	}
}