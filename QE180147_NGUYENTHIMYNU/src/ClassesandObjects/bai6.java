package ClassesandObjects;

import java.util.Scanner;

public class bai6 
{
    public static class Student 
    {
        String name;
        int age;
        String gender;
        double gpa;
        public void getInformation() 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            name = sc.nextLine();
            System.out.print("Enter Age: ");
            age = sc.nextInt();
            System.out.print("Enter gender: ");
            gender = sc.next();
            System.out.print("Enter gpa: ");
            gpa = sc.nextDouble();
        }
        public Student() 
        {
        }
        public void display() 
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("gender: " + gender);
            System.out.println("gpa : " + gpa);
        }

        public static void main(String[] args) 
        {
            Student s1 = new Student();
            s1.getInformation();
            s1.display();

        }
    }
}
