/*
Bạn hãy khai báo lớp Circle với thông tin giống như sau:



Giải thích:

radius là thuộc tính chỉ bán kính của đường tròn
Circle(radius: double) là phương thức khởi tạo có tham số dùng để gán giá trị cho thuộc tính radius
getArea() và getCircumference() là hai phương thức trả về diện tích và chu vi của hình tròn với pi (π) = 3.14.
Chương trình dùng để test lớp Circle:

public class Entry {
	public static void main(String[] args) {
		Circle c = new Circle(7);
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());
	}
}
Kết quả khi chạy chương trình:

153.86
43.96
 */
package week3.classesandobjects.exc10;

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
