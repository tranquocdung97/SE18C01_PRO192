
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XUAN HIEN
 */
public class bai39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = sc.nextInt();
        if (diem < 0 || diem > 10) {
            System.out.println("The score is not valid");
        } else {
            System.out.println("The score is valid");
        }
    }
}
