/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

import java.awt.Point;

/**
 *
 * @author ADMIN
 */
public class Exercise7 {
    private double x;
    private double y;
    public Exercise7()
    {

    }
    public Exercise7(double x, double y)
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
