/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uutils;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public class inputter {
    private Scanner sc;
    private validation val;

    public inputter() {
        this.sc = new Scanner(System.in);
        this.val = new validation();
    }
    
    public String getString(String name){
        String str;
        while (true) {            
            System.out.println("nhap "+name);
            str =sc.nextLine().trim();//loai bo dau trang o chuoi
            if(val.checkEmpty(str)){
                System.err.println("chuoi co chua khoang trang");
            }else {
                return str;
            }
        }
    }
    public double getDouble(String name){
        double a;
        while (true) {            
            System.out.println("nhap  "+name);
            a = Double.parseDouble(sc.nextLine()) ;
            if(val.checkPostiveNumber(a)){
                return a;
            }else{
                System.err.println("vui long nhap lai: ");
            }
        }
    }
    
}
