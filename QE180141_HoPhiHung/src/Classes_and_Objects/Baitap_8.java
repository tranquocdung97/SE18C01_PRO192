/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;
public class Baitap_8 {
//class Student {
    private String name;
    private int age;
   // public Student() {
    public  Baitap_8 () {     
    }
    public void getInformation() {
        name = new Scanner(System.in).next();
        age = new Scanner(System.in).nextInt();
    }   
    public void display() {
        System.out.print(
            "Name: " + name + "\n" +
            "Age: " + age
        );
    }
 }
/*
Ký tự '-' sẽ tương ứng với phạm vi truy cập private.
Ký tự '~' sẽ tương ứng với phạm vi truy cập default.
Ký tự '#' sẽ tương ứng với phạm vi truy cập protected.
Ký tự '+' sẽ tương ứng với phạm vi truy cập public.
*/