/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class EX2 {
    import java.util.Scanner;

    class Rectangle{
	double length, width;
	public void getInformation(){
            Scanner sc = new Scanner(System.in);
            length = sc.nextDouble();
            width = sc.nextDouble();
	}
	public double getArea(){
            return length * width;
	}
	public double getPerimeter(){
            return (length + width) * 2;
	}
	public void display(){
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
	}
}

    public class Entry {
	public static void main(String[]args) {
            Rectangle r = new Rectangle();
            r.getInformation();
            r.display();
        }
    }
}
