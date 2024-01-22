/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */
public class Baitap_10 {
//public class Circle {
    private double radius ;
    // Constructor
    public Baitap_10 (){

    } 
    public Baitap_10 (double radius   ){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getCircumference(){
        return 3.14 * 2 * radius;
    }

    //public getInformation 
    public void display (){
        System.out.println ("Area: "          + getArea());
        System.out.println ("Circumference: " + getCircumference());
    }
}
class Entry {
    public static void main(String[] args ){
        Baitap_10 c = new Baitap_10 (2) ; 
        c.display () ; 
    }
}