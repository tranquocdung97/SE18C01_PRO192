
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XUAN HIEN
 */
public class bai27 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ten: ");
        String name =sc.next();
        System.out.println("nhap tuoi: ");
        int age= sc.nextInt();   
        System.out.println("In 15 years, age of " + name + " will be " + (age + 15));
	}
}
