/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180159_lethihaiha.Static;

/**
 *
 * @author admin
 */
public class bai12 {
    private String name;
    private char gender;

    public bai12 () {
        name = "Unknown";
        gender = 'u' ;
    }

    public bai12 (String name) {
        this.name = name;
        this.gender = 'u';
    }
     public bai12 (char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }
    public bai12(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    public void display() {
        System.out.println("Name: " + name) ;
        if (gender == 'u' ){
            System.out.println("Gender: Unknown");
        }
        if ( gender == 'm'){
            System.out.println("Gender: Male");
        }
        if ( gender == 'f'){
            System.out.println("Gender: Female");
        }
    }
}
