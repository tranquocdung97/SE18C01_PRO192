/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Ho Phi Hung
 */
public class baitap20 {
    
//public class Employee {
    private int id ;
    private String firstName;
    private String lastName ;
    private int salary;

    public baitap20 (int id , String firstName , String lastName , int salary){
        this.id = id ;
        this.firstName = firstName ;
        this.lastName  = lastName  ; 
        this.salary    = salary    ; 
    }

    public void setId(int id ){
        this.id = id ;
    }
    public void setFirstName (String firstName ){
        this.firstName = firstName ;
    }
    public void setLastName (String lastName ){
        this.lastName = lastName;
    }
    public void setSalary (int salary){
        this.salary = salary ; 
    }

    public int getId (){
        return id ; 
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName ;
    }

    public String getFullName(){
        return firstName + lastName ;
    }

    public int getSalary (){
        return salary;
    }

}