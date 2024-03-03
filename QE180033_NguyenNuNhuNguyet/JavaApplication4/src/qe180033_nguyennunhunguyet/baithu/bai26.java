/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qe180033_nguyennunhunguyet.baithu;

/**
 *
 * @author FPTSHOP
 */
class Employee{
    private String name;
    private int salary;
    public Employee(String name , int salary){
        this.name = name ;
        this.salary = salary ;
    }
    public String getName (){
        return name;
    }
    public void setName( String name){
        this.name = name ;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary ;
    }
    public void display(){
        System.out.println("Name: " + name );
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
    private int bonus;
    public Manager( String name , int salary , int bonus){
        super(name, salary);
        this.bonus = bonus ;
    }
    public int getSalary() {
		return super.getSalary() + bonus;
	}
    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
        this.bonus = bonus ;
    }
    public void display(){
        System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary());
    }
}
public class bai26 {
    
}
