/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week_3;

import java.util.Scanner;
import java.util.Scanner;

class Student {

    String name;
    int age;

    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

/**
 *
 * @author Administrator
 */
public class CL_w3_BT2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getInformation();
        s1.display();
    }

}
