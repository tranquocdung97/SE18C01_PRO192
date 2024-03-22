/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author ADMIN
 */
public class Exercise6 {
    private double radius;
    public Exercise6(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return radius * radius * 3.14;
    }
    public double getCircumference()
    {
        return radius * 3.14 * 2;
    }
}
