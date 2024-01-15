/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selection_statements;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;
 public class Baitap_41 {
     //public class SelectionStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ( x > 0 && y > 0 ){
            System.out.println("This point lies in the First quadrant");
        }else if( x < 0 && y > 0 ){
            System.out.println("This point lies in the Second quadrant");
        }else if( x < 0 && y < 0 ){
            System.out.println("This point lies in the Third quadrant");
        }else if( x > 0 && y < 0 ){
            System.out.println("This point lies in the Fourth quadrant");
        }
    }
}