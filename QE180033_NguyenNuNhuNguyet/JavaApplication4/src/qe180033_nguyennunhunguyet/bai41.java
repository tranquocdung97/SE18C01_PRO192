/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet;

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;
public class bai41 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a>0 && b>0)
            System.out.println("This point lies in the First quadrant");
        if(a<0 && b<0)
            System.out.println("This point lies in the Third quadrant");
        if(a<0 && b>0)
            System.out.println("This point lies in the Second quadrant");
        if(a>0 && b<0)
            System.out.println("This point lies in the Fourth quadrant");
    }
}
