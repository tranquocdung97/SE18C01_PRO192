/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.object;

/**
 *
 * @author admin
 */
public class bai2 {
    public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
class Rectangle{
	double length, width;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
    public double getArae(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }
    public void display(){
        System.out.println("Area: " + getArae());
        System.out.println("Perimeter: " + getPerimeter());
    }
}