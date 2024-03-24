/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager_lecture;

import java.util.ArrayList;
import java.util.Scanner;
import model.day;
import model.lecture;
import untils.inputter;
import view.menu;
import view.viewlecture;

/**
 *
 * @author trieu
 */
public class controller extends menu {

    private ArrayList<lecture> listlecture;
    private inputter input;
    private viewlecture view;
    private Scanner sc;

    public controller() {
        super("quan ly gian vien", new String[]{"cong giang vien", "xoa giang vien", "sua giang vien", "tim kiem qua email"});//kế thừa 
        listlecture = new ArrayList<>();
        input = new inputter();
        view = new viewlecture();
        sc = new Scanner(System.in);

    }

    public void conggiangvien() {
        day d = new day();//tạo đối tượng day
        String name = input.getString("ten giang vien: ");//gọi phương thức truyền dữ liệu trong input
        d = input.getDay("ngay thang nam sinh: ");
        String address = input.getString("dia chi ");
        String mail = input.getString("dia chi mail");
        String phone = input.getString("so dien thoai");
        listlecture.add(new lecture(name, d, address, mail, phone));//truyển vào array listlecture 1 đối tượng giảng viên
    }

    public void displayall() {
        view.display(listlecture);// gọi phương thức display trong viewlecture
    }

    public void xoagiangvien() {
        displayall();
        int nhap = input.getInt("lua chon cua ban:");
        while (nhap < 1 && nhap > listlecture.size()) {
            //size la do dai cua listlecture
            nhap = input.getInt("lua chon cua ban:");
        }
        listlecture.remove(nhap - 1);
    }
    
    public void suagiangvien(){
        displayall();
        int s = input.getInt("lua chon cua ban: ");
        while(s <1 && s > listlecture.size()){
            s = input.getInt("lua chon cua ban");
        }
        day d = new day();//tạo đối tượng day
        String name = input.getString("ten giang vien: ");//gọi phương thức truyền dữ liệu trong input
        d = input.getDay("ngay thang nam sinh: ");
        String address = input.getString("dia chi ");
        String mail = input.getString("dia chi mail");
        String phone = input.getString("so dien thoai");
        listlecture.set((s-1) , new lecture(name, d, address, mail, phone));//truyển vào array listlecture 1 đối tượng giảng viên
    }
    public void timkiemquaemail(){
        String n = sc.nextLine();
        for(lecture a : listlecture){
            if(n.equals(a.getEmail()) ){
                System.out.println(a.toString());
            }
        }
    }
    @Override
    public void toiyeuem(int n) {
        switch (n) {
            case 1:
                conggiangvien();
                break;
            case 2:
                xoagiangvien();
                break;
            case 3:
                suagiangvien();
                break;
            case 4:
                timkiemquaemail();
                break;
            default:
                System.out.println("xin chao va hen gap lai");
        }
    }

}
