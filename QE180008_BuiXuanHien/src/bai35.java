
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XUAN HIEN
 */
public class bai35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenA = sc.next();
        String tenB = sc.next();
        if (tenA.equals(tenB)) {
            System.out.println("two people have the same name");
        } else {
            System.out.println("two people don't have the same name");
        }
    }
}
