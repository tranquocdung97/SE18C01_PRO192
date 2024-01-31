import java.util.Scanner;

class Rectangle{
	double area, perimeter;
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        area = sc.nextDouble();
        perimeter = sc.nextDouble();
    }
    public double getArea(){
        return area * perimeter;
    }
    public double getPerimeter(){
        return (area + perimeter)*2;
    }

    public void display(){
        System.out.println("Area: "+getArea());
        System.out.println("Perimeter: "+getPerimeter());

    }
}
public class bt2 {
        public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}
