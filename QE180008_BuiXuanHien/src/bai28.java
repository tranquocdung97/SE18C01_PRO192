
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XUAN HIEN
 */
public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri cua a: ");
        int a = sc.nextInt();
        System.out.println("nhap gia tri cua b: ");
        int b = sc.nextInt();
        int c=a;
        a=b;
        b=c;
	System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}
