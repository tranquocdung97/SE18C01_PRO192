/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesandObjects;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bai2 {

    public static class Student {

        String name;
        int age;

        public void getInformation() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Age: ");
            while (true) {
                try {
                    age = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhap so deo phai chu");
                    System.out.print("Nhap cmm lai: ");
                }
            }
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }

}
