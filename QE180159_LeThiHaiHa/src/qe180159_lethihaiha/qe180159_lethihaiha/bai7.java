/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.object;

/**
 *
 * @author admin
 */
public class bai7 {
    private double radius;

    public bai7 (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return 3.14 * radius * radius;
    }
    public double getCircumference() {
        return 3.14 * 2 * radius;
    }
}
