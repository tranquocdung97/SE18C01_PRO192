/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class as1 {

    class Person {

        private String name;
        private int dob;

        public Person(String name, int dob) {
            this.name = name;
            this.dob = dob;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDob() {
            return dob;
        }

        public void setDob(int dob) {
            this.dob = dob;
        }
    }

    class Student extends Person {

        private double gpa;

        public Student(String name, int dob, double gpa) {
            super(name, dob);
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        public void stGpa(double gpa) {
            this.gpa = gpa;
        }
    }

    public class Entry {

        public static void main(String[] args) {
            Student s = new Student("Hai", 1999, 8.8);
            System.out.println("Name: " + s.getName());
            System.out.println("Date of birth: " + s.getDob());
            System.out.println("GPA: " + s.getGpa());
        }
    }
}
