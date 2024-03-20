/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */
public class bai4 {

    public static void main(String[] args) {
        IEmployee employee2 = new PartTimeEmployee("Trung", 45000, 7);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());

        IEmployee employee3 = new FullTimeEmployee("Linh", 65000);
        System.out.println("Name: " + employee3.getName());
        System.out.println("Salary per day: " + employee3.calculateSalary());
    }
}