/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Product;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ProductView {
    public void displayList(ArrayList<Product> products){
        for (Product product : products) {
           System.out.println(product);
        }
    } 
}
