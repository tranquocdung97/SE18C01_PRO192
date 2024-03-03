/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
 class bt13 {
private double length;
	private double width;

	public bt13() 
    {

	}

	public bt13(double length, double width) 
    {
		this.length = length;
		this.width = width;
	}

	public double getLength() 
    {
		return length;
	}

	public void setLength(double length) 
    {
		this.length = length;
	}

	public double getWidth() 
    {
		return width;
	}

	public void setWidth(double width)
    {
		this.width = width;
	}

	public double getArea() 
    {
		return length * width;
	}

	public double getPerimeter() 
    {
		return (length + width) * 2;
	}    
}
