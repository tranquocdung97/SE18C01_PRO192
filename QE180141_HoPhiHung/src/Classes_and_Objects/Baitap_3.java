/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */

import java.util.Scanner;

class Rectangle{ 
    double length ; //attribute
    double width ; //attribute
    public void getInformation(){
        Scanner sc = new Scanner (System.in); 
        length = sc.nextDouble (); //methor
        width  = sc.nextDouble (); //methor
    }
    public void display (){  
        System.out.println("Area: "+ length*width); //methor 
        System.out.println("Perimeter: "+ (length + width)*2); //methor 
    }
}
public class Baitap_3 {
    
//public class Entry {
	public static void main(String[]args) {
		Rectangle r = new Rectangle(); // khai bao doi tuong r thuoc Rectangle
		r.getInformation();     // de truy xuat dung  ". " de 
		r.display();
	}
}