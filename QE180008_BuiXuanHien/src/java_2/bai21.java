/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_2;

/**
 *
 * @author XUAN HIEN
 */
class Person {

    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class study12 extends bai22 {

    private int salary;

    public study12(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

   
    @SuppressWarnings("SillyAssignment")
    public void setSalary() {
        this.salary = salary;
    }

   
    @SuppressWarnings("override")
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

public class bai21 {

    public static void main(String[] args) {
        study12 sc = new study12("Trung", "Male", 1700);
        sc.display();
    }
}
