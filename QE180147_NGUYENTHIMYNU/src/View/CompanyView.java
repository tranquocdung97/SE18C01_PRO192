/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Company;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class CompanyView {
    public void displayList(ArrayList<Company> companys){
        for (Company company : companys) {
           System.out.println(company);
        }
    } 
}
