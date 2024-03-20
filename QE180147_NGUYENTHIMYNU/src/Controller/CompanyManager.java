/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Company;
import Utils.InputterCompany;
import View.CompanyView;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CompanyManager {

    static Scanner sc = new Scanner(System.in);
    private final ArrayList<Company> list = new ArrayList<>();

    public void addCompany(Company t) {
        t.setId(++Company.dem);
        list.add(t);
    }

    public void addCompany(Company... thatList) {
        for (Company company : thatList) {
            company.setId(++company.dem);
            this.list.add(company);
        }

    }

    public void addCompany() {
        InputterCompany t = new InputterCompany();
        t.InputterCompany();
        t.getT().setId(++Company.dem);
        this.list.add(t.getT());
        System.out.println("them thanh cong");
        System.out.println("----------------------------------------");
    }

    public void showAllCompanys() {
        CompanyView view = new CompanyView();
        view.displayList(list);
        System.out.println("xuat ra thanh cong");
        System.out.println("----------------------------------------");
    }

    public void executeCompany() {
        int choice;
        do {
            System.out.println("1.addCompany ");
            System.out.println("2.Display All");
            System.out.println("3.Exit");
              System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    addCompany();
                }
                case 2 -> {
                    showAllCompanys();
                }
            }
        } while (choice != 0);
    }
}
