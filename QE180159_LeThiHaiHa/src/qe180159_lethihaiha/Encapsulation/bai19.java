/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.Encapsulation;

/**
 *
 * @author admin
 */
public class bai19 {
    private double x;
    private double y;

    public bai19() {
    }

    public bai19 (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY(){
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) *  (this.x - x) + (this.y - y) * (this.y - y)) ;
    }
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}
