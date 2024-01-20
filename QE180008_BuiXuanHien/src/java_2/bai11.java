/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;

/**
 *
 * @author XUAN HIEN
 */
public class Student1 {

    private String name;
    private char gender;

    public Student1() {
        name = "Unknown";
        gender = 'u';
    }

    public Student1(String name) {
        this.name = name;
        this.gender = 'u';
    }

    public Student1(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }

    public Student1(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        if (gender == 'u') {
            System.out.println("Gender: Unknown");
        }
        if (gender == 'm') {
            System.out.println("Gender: Male");
        }
        if (gender == 'f') {
            System.out.println("Gender: Female");
        }
    }
}

public class bai11 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student1 s2 = new Student1("Quang");
        s2.display();
        Student1 s3 = new Student1('m');
        s3.display();
        Student1 s4 = new Student1("Thu", 'f');
        s4.display();
    }
}
