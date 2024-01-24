/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */

import java.util.Scanner;

class Rectangle{
	double chieudai;
    double chieurong;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextDouble();
        chieurong = sc.nextDouble();
    }
    public double getArea(){
        return chieudai*chieurong;
    }
    public double getPerimeter(){
        return (chieudai+chieurong)*2;
    }

    public void display(){
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}
public class bai2 {
    public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
