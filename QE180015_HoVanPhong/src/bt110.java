public interface IShape {
    double getArea();
    double getPerimeter();
}
public class Rectangle implements IShape {
    private double length;
    private double width;
    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;

    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override 
    public double getPerimeter() {
		return (length + width) * 2;
	}
}
public class Circle implements IShape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}
}
public class bt110 {
    
}
