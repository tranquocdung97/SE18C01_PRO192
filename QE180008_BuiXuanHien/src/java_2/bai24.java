/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;

/**
 *
 * @author XUAN HIEN
 */
class Student7 {

    private String name;
    private String address;
    private double gpa;

    public Student7(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    @SuppressWarnings("override")
    public String toString() {
        return "Name: " + name + ", address: " + address + ", GPA: " + gpa;
    }
}

public class bai24 {

    public static void main(String[] args) {
        Student7 s = new Student7("Kien", "Ha Noi", 6.6);
        System.out.println(s);
    }
}
