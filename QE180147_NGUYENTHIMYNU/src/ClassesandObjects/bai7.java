
package ClassesandObjects;

public class bai7 {
    public static class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public double getCircumference() {
		return 3.14 * 2 * radius;
	}
        public static void main(String[] args) 
        {
            Circle c = new Circle (7.8);
                System.out.println(c.getArea());
		System.out.println(c.getCircumference());
        }
}
}
