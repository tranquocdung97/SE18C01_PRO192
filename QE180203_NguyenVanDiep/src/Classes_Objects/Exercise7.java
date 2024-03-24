/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Objects;

/**
 *
 * @author ADMIN
 */
class Student2 {
    String name;
    int age;
    public Student2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        Student2[] students = new Student2[3];
        students[0] = new Student2("Tuan", 24);
        students[1] = new Student2("Cuong", 25);
        students[2] = new Student2("Duc", 24);
        for (int i = 0; i < 3; i++)
            students[i].display();
    }
}
