/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package untils;

import java.util.Scanner;
import model.day;

/**
 *
 * @author trieu
 */
public class inputter {

    private Scanner sc;
    private Validation val;

    public inputter() {
        this.sc = new Scanner(System.in);
        this.val = new Validation();
    }
  
    

    public String getString(String name) {
        String str;
        while (true) {
            System.out.println("nhap "+name);
            str = sc.nextLine().trim(); // trim() xóa khoảng trắng ở đầu và cuối chuỗi
            if (val.checkEmpty(str)) {//truyền chuỗi str vào validation để kiểm tra
                System.err.println(name + "chuoi khong rong"); // in ra nếu như gặp lỗi
            } else {
                return str;
            }
        }
    }
    
    public day getDay(String name){
        try {
            System.out.println("nhap "+name);
            System.out.println("nhap  vao ngay: ");
            int d = Integer.parseInt(sc.nextLine());
            System.out.println("nhap  vao thang: ");
            int m = Integer.parseInt(sc.nextLine());
            System.out.println("nhap  vao nam: ");
            int y = Integer.parseInt(sc.nextLine());
            return new day(d, m, y);
        } catch (Exception e) {
            System.err.println("nhap vao gia tri khac: ");
            
        }
        return null;
    }
    public int getInt(String name) {
        int x;
        while (true) {
            System.out.println("nhap vao ten: ");
            x = sc.nextInt();
            if (val.checkPositiveNumber(x)) {
                return x;

            } else {
                System.err.println(x + "vui long nhap lai");
            }

        }
    }
}