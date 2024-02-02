/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation_OOP;

/**
 *
 * @author Ho Phi Hung
 */

public class baitap23 {
    private double x ; 
    private double y ;

    public baitap23(){

    }

    public baitap23(double x , double y){
        this.x = x ;
        this.y = y ;  
    }

    public void setX (double x ){
        this.x = x ; 
    }

    public double  getX (){
        return x ; 
    }

    public void setY (double y ){
        this.y =  y ; 
    }

    public double getY (){
        return y ; 
    }

    public void setXY (double  x , double y ) {
        this.x = x ; 
        this.y = y ; 
    }

    public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public double distance(baitap23 another) {
		return distance(another.getX(), another.getY());
	}
    }
