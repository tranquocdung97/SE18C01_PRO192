/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class bt76 {
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ketqua = "";
           for(int i = s.length() - 1; i>=0; i--){
              ketqua += s.charAt(i);
           }
               System.out.print(ketqua);
            }  
}   
