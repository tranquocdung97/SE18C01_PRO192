/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.util.Scanner;

public class ApplicationManager {

    static Scanner sc = new Scanner(System.in);

    public void execute() throws IOException {
        int choice;
        do {
            System.out.println("1.Company Manager ");
            System.out.println("2.Product Manager");
            System.out.println("3.Order Manager");
            System.out.println("4.Exit");
              System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    CompanyManager tea = new CompanyManager();
                    tea.executeCompany();
                }
                case 2 -> {
                    ProductManager tea = new ProductManager();
                    tea.executeProduct();
                   
                }
                case 3 -> {
                    OrderManager tea = new OrderManager();
                    tea.executeOrder();
    
                }

            }
        } while (choice != 0);
    }
}
