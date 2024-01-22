/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class bt46 {
   	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        int tong = 0;
        for(int i = 1; i<= n; i++){
            if(i%2 == 1){
                tong +=  i;
            }
        }
          System.out.println(tong);
	} 
}
