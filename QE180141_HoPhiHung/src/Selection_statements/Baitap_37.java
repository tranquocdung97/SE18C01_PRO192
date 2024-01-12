/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_37 {
  //public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt () , b = sc.nextInt () , c = sc.nextInt ();
        int max = -999999; 
        if (max < a  ){
            max = a ; 
        }if (max < b){
            max = b;
        }if (max < c){
            max = c ;
        }
        System.out.println (max);
	}
 }