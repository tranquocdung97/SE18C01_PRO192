/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Model.Company;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputterCompany {

    private Company t = new Company();

    public void InputterCompany() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        t.setName(sc.nextLine());
        System.out.print(" address: ");
        t.setAddress(sc.nextLine());
        System.out.println("phoneNumber: ");
        t.setPhoneNumber(sc.nextLine());
    }

    public Company getT() {
        return t;
    }

    public void setT(Company t) {
        this.t = t;
    }

}
