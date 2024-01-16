
import java.util.Scanner;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class CL_w1_BT39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0 && a <= 10) {
            System.out.println("The score is valid");
        } else {
            System.out.println("The score is not valid");
        }
    }
}
