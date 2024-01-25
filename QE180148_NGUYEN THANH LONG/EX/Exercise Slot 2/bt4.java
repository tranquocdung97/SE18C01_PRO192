/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class bt4
{
    private String name;
    private int age;

public bt4()
{

}
public void getInformation() 
{
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    age = sc.nextInt();
}
public void display ()
{
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
}
}
