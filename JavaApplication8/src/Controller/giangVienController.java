package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.giangVien;
import view.giangVienView;

public class giangVienController {

    private List<giangVien> danhSach;
    Scanner sc = new Scanner(System.in);

    public giangVienController() {
        this.danhSach = new ArrayList<giangVien>();
    }

    //them gv
    public List<giangVien> themGV() {
        System.out.println("Nhap ten GV: ");
        sc.nextLine();
        String ten = sc.nextLine();
        System.out.println("Nhap email GV: ");
        String email = sc.nextLine();
        System.out.println("Nhap number phone GV: ");
        int id = sc.nextInt();
        giangVien gv = new giangVien(id, ten, email);
        danhSach.add(gv);
        return danhSach;
    }

    //xoa gv
    public List<giangVien> xoaGV() {
        System.out.println("Nhap ten GV can xoa: ");
        String ten = sc.nextLine();
        sc.nextLine();
        for (giangVien a : danhSach) {
            if (a.getTen().equalsIgnoreCase(ten)) {
                danhSach.remove(a);
                break;
            }
        }
        return danhSach;
    }

    //in thong tin giang vien
    public void inGV() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            giangVienView.display(danhSach);
        }
    }

    //sua thong tin giang vien
    public List<giangVien> suaGV() {
        sc.nextLine();
        System.out.println("Nhap ten giao vien ban muon sua: ");
        String xetTen = sc.nextLine();
        for (giangVien a : danhSach) {
            if (a.getTen().equalsIgnoreCase(xetTen)) {
                System.out.println("Nhap email: ");
                String email = sc.nextLine();
                System.out.println("Nhap so dien thoai: ");
                int id = sc.nextInt();
                System.out.println("Nhap ten: ");
                sc.nextLine();
                String ten = sc.nextLine();
                a.setEmail(email);
                a.setId(id);
                a.setTen(ten);
            }
        }
        return danhSach;
    }
    
    //tim kiem theo email
    public void timEmail(){
        int s = 0;
        sc.nextLine();
        System.out.println("Nhap email giao vien ban muon tim kiem: ");
        String xetEmail = sc.nextLine();
        for(giangVien e : danhSach){
            if(e.getEmail().equalsIgnoreCase(xetEmail)){
                System.out.println(e);
                s++;
            }
        }
        if (s == 0){
            System.out.println("Khong tim thay giang vien.");
        }
    }

    public void menu() {
        boolean flag = true;
        while (flag) {
            System.out.println("1. Them GV");
            System.out.println("2. Xoa GV");
            System.out.println("3. Hien thi danh sach GV");
            System.out.println("4. Sua thong tin GV");
            System.out.println("5. Tim kiem GV theo email");
            System.out.println("Lua chon cua ban la: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    themGV();
                    break;
                case 2:
                    xoaGV();
                    break;
                case 3:
                    inGV();
                    break;
                case 4:
                    suaGV();
                    break;
                case 5:
                    timEmail();
                    break;
                default:
                    flag = false;
                    break;

            }
        }
    }

}
