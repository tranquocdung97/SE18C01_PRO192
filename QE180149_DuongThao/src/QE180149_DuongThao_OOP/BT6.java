 
package QE180149_DuongThao.OOP;
 
public class BT6 {
class Circle {
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
}

}
