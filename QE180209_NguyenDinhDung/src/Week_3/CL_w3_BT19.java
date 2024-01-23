/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

public class Student {

    private String name;
    private char gender;

    public Student() {
        name = "Unknown";
        gender = 'u';
    }

    public Student(String name) {
        this.name = name;
        this.gender = 'u';
    }

    public Student(char gender) {
        this.name = "Unknown";
        this.gender = gender;
    }

    public Student(String name, char gender) {
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

/**
 *
 * @author Administrator
 */
public class CL_w3_BT19 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Quang");
        s2.display();
        Student s3 = new Student('m');
        s3.display();
        Student s4 = new Student("Thu", 'f');
        s4.display();
    }
}
