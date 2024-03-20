/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Model.Order;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputterOder {
    private Order t = new Order();

    public void InputterOder() {
        Scanner sc = new Scanner(System.in);
        System.out.print(": orderID: ");
        t.setOrderID(sc.nextInt());
        System.out.print("  companyID: ");
        t.setCompanyID(sc.nextInt());
        System.out.println("productID: ");
        t.setProductID(sc.nextInt());
        System.out.println(" quantity");
        t.setQuantity(sc.nextInt());
    }

    public  Order getT() {
        return t;
    }

    public void setT(Order t) {
        this.t = t;
    }

}
