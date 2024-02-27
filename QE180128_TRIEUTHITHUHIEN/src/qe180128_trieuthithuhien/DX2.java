/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class DX2 {
    /*Person.java*/
    public abstract class Person {

        private String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public abstract void display();

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    /*Employee.java*/
    public class Employee extends Person {

        private int salary;

        public Employee(String name, String address, int salary) {
            super(name, address);
            this.salary = salary;
        }
        
        public void display() {
            System.out.println("Employee name: " + super.getName());
            System.out.println("Employee address: " + super.getAddress());
            System.out.println("Employee salary: " + salary);
        }
    }
    /*Customer.java*/
    public class Customer extends Person {

        private int balance;

        public Customer(String name, String address, int balance) {
            super(name, address);
            this.balance = balance;
        }

        public void display() {
            System.out.println("Customer name: " + super.getName());
            System.out.println("Customer address: " + super.getAddress());
            System.out.println("Customer balance: " + balance);
        }
    }
}
