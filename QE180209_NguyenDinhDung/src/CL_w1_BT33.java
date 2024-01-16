/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CL_w1_BT33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("n is a positive number");
        } else if (a < 0) {
            System.out.println("n is a negative number");
        } else {
            System.out.println("n is equal to 0");
        }
    }
}
