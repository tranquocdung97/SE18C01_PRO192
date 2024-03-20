/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Product;
import Utils.InputterProduct;
import View.ProductView;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ProductManager {

    static Scanner sc = new Scanner(System.in);
    private final ArrayList<Product> list = new ArrayList<>();

    public void addProduct(Product t) {
        t.setId(++Product.dem);
        list.add(t);
    }

    public void addProduct(Product... thatList) {
        for (Product product : thatList) {
            product.setId(++product.dem);
            this.list.add(product);
        }

    }

    public void addProduct() {
        InputterProduct t = new InputterProduct();
        t.InputterProduct();
        t.getT().setId(++Product.dem);
        this.list.add(t.getT());
        System.out.println("them thanh cong");
        System.out.println("----------------------------------------");
    }

    public void showAllProduct() {
        ProductView view = new ProductView();
        view.displayList(list);
        System.out.println("xuat ra thanh cong");
        System.out.println("----------------------------------------");
    }

//    void ExportFile() throws IOException {
//        FileWriter out = new FileWriter("src/quanli/quanli1.txt");
//        for ( Product product : list) {
//            out.write("ID: " + product.getId() + "\n");
//            out.write("Ho va ten: " + product.getFullname() + "\n");
//            out.write(product.getGender() + "\n");
//            out.write(product.getHometown() + "\n");
//            out.write(product.getBirthDateS() + "\n");
//            out.write(product.getGmail() + "\n");
//        }
//        out.close();
//        System.out.println("\t\tXuat File thanh cong");
//    }
    public void executeProduct() throws IOException {
        int choice;
        do {
            System.out.println("1. AddProduct");
            System.out.println("2. Display All");
            System.out.println("3. Load from file");
            System.out.println("4. save from file");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    showAllProduct();
                }
                case 2 -> {
                    addProduct();
                }
                case 3 -> {
                    ;
                }
                case 4 -> {
                    ;
                }

            }
        } while (choice != 0);

    }
}
