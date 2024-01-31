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
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    class Student7 extends Person {

        private double gpa;

        public Student7(String name, int age, String address, double gpa) {
            super(name, age, address);
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @SuppressWarnings("override")
        public void display() {
            super.display();
            System.out.println("GPA: " + gpa);
        }
    }

    class Teacher3 extends Person {

        private int salary;

        public Teacher3(String name, int age, String address, int salary) {
            super(name, age, address);
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @SuppressWarnings("override")
        public void display() {
            super.display();
            System.out.println("Salary: " + salary);
        }
    }

    public class bai22 {
        public static void main(String[] args) {
            Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
            s.display();
            System.out.println();
            Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
            t.display();
        }
    }