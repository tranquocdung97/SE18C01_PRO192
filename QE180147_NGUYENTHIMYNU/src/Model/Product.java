/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Product {
    static public int dem = 0;
    private int id;
    private String name;
    private String description;
    private String amount;
    private  int price;
   public Product(){
       
   } 

    public Product(int id, String name, String description, String amount, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
   public String toString() {
        return "ID: " + id + "\nName: " + name
                + "\nDescription: " + description + "\nAmount: " + amount + "\nPrice "+price ;

    }
}
