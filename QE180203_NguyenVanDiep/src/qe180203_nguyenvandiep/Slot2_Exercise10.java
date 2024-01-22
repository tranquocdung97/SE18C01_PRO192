/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qe180203_nguyenvandiep;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Slot2_Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0)
            if (y > 0) System.out.println("This point lies in the First quadrant");
            else System.out.println("This point lies in the Fourth quadrant");
        else
            if (y > 0) System.out.println("This point lies in the Second quadrant");
            else System.out.println("This point lies in the Third quadrant");     
    }
}
