/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;

class Rectangle{
    double d,g;
	public void getInformation(){
        Scanner s=new Scanner(System.in);
        d=s.nextDouble();
        g=s.nextDouble();
    }
    public double Area(){
        return d * g;
    }
    public double Peri(){
        return (d+g)*2;
    }
    public void display(){
        System.out.println("Area: "+ Area());
        System.out.println("Perimeter: " + Peri());
    }
}
public class bai22 {
    public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
