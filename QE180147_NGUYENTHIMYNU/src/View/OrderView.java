/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Order;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class OrderView {
    public void displayList(ArrayList<Order> orders){
        for (Order order : orders) {
           System.out.println(order);
        }
    } 
}
