/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */
import java.util.Scanner;
public class Baitap_33 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
    if ( n > 0 ){
        System.out.println("n is a positive number");
    }else if (n < 0 ){
        System.out.println("n is a negative number");
    }else {
        System.out.println("n is equal to 0");
    }
    }
}

