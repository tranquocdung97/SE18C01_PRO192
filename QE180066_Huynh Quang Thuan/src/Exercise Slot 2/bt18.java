
import java.awt.Point;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class bt18 {
private double x;
	private double y;

	public bt18() 
    {
	}
	
	public bt18(double x, double y) 
    {
		this.x = x;
		this.y = y;
	}

	public double getX() 
    {
		return x;
	}

	public void setX(double x) 
    {
		this.x = x;
	}

	public double getY() 
    {
		return y;
	}

	public void setY(double y) 
    {
		this.y = y;
	}

	public void setXY(double x, double y) 
    {
		this.x = x;
		this.y = y;
	}

	public double distance(double x, double y) 
    {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public double distance(Point another) 
    {
		return distance(another.getX(), another.getY());
	}    
}
