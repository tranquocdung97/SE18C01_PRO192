/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Model.Product;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputterProduct {
    private Product t = new Product();

    public void InputterProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print(": ID: ");
        t.setId(sc.nextInt());
        System.out.print("Name: ");
        t.setName(sc.nextLine());
        System.out.println("description: ");
        t.setDescription(sc.nextLine());
        System.out.println("Price");
        t.setPrice(sc.nextInt());
        System.out.println("amount ");
        t.setAmount(sc.nextLine());
    }

    public Product getT() {
        return t;
    }

    public void setT(Product t) {
        this.t = t;
    }

}
