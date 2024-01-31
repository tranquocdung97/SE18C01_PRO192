package QE180149_DuongThao.OOP;

import java.util.Scanner;

class Rectangle {

    double length;
    double width;
    double arena;
    double perimeter;
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();

    }

   public void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    public double getPerimeter() {
        perimeter = length + width * 2;
        return perimeter;
    }

    public double getArea() {
        arena = length * width;
        return arena;
    }
}

public class BT2
 {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
