/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Order;
import Utils.InputterOder;
import View.OrderView;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class OrderManager {
   static Scanner sc = new Scanner(System.in);
    private final ArrayList<Order> list = new ArrayList<>();


    
    
    public void addOrder() {
        InputterOder t = new InputterOder();
        t.InputterOder();
        t.getT();
        this.list.add(t.getT());
        System.out.println("them thanh cong");
        System.out.println("----------------------------------------");
    }
    public void showAllOrders() {
        OrderView view = new OrderView();
        view.displayList(list);
        System.out.println("xuat ra thanh cong");
        System.out.println("----------------------------------------");
    }
    public void executeOrder()  {
        int choice;
        do {
            System.out.println("1.addOder ");
            System.out.println("2.Display All");
            System.out.println("3.Exit");
              System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                   addOrder();
                }
                case 2 -> {
                  addOrder () ;
                }
            }
        } while (choice != 0);
} 
}
