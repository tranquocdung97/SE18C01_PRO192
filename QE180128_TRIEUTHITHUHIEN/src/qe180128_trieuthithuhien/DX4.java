/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180128_trieuthithuhien;

/**
 *
 * @author TRIEU HIEN
 */
public class DX4 {
    /*IEmployee.java*/
    public interface IEmployee {

        int calculateSalary();

        String getName();
    }
    /*Employee.java*/
    public abstract class Employee implements IEmployee {

        private String name;
        private int paymentPerHour;

        public Employee(String name, int paymentPerHour) {
            this.name = name;
            this.paymentPerHour = paymentPerHour;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPaymentPerHour() {
            return paymentPerHour;
        }

        public void setPaymentPerHour(int paymentPerHour) {
            this.paymentPerHour = paymentPerHour;
        }
    }
    /*PartTimeEmployee.java*/
    public class PartTimeEmployee extends Employee {

        private int workingHours;

        public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
            super(name, paymentPerHour);
            this.workingHours = workingHours;
        }

        public int calculateSalary() {
            return workingHours * getPaymentPerHour();
        }
    }
    /*FullTimeEmployee.java*/
    public class FullTimeEmployee extends Employee {

        public FullTimeEmployee(String name, int paymentPerHour) {
            super(name, paymentPerHour);
        }

        public int calculateSalary() {
            return 8 * getPaymentPerHour();
        }
    }
}
