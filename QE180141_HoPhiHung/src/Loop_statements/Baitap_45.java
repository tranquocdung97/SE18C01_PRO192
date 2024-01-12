/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_45 { 
    //public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt () , b = sc.nextInt () , c = 0 ;
        for ( int i = a ; i <= b ; i++ ){
            c += i ; 
        }            System.out.print( c);
        }
}