/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */
 class Student1 {

    private String name;
    private int age;
    private String gender;
    private double gpa;

    public Student1(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }

}

public class bai5 {

    public static void main(String[] args) {
        Student1 s = new Student1("Quang", 24, "Male", 7.7);
        s.display();
     }
}
