/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress_test;

/**
 *
 * @author FPTSHOP
 */
import java.util.Scanner;

class teacher {
}

public class bai4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("1.Thêm giảng viên.");
            System.out.println("2.Xóa giảng viên.");
            System.out.println("3.Sửa thông tin giảng viên.");
            System.out.println("4.Tìm kiếm qua email.");
            System.out.println("5.Export danh sách ra file.");
            System.out.println("6.Import danh sách từ file.");
            System.out.println("7.Thoát.");
            System.out.println("-----------------------------------------------");
            System.out.print("chon: ");
            int chon = input.nextInt();
            switch (chon) {
                case 1: {
                    System.out.println("1.Thêm giảng viên.");
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("2.Xóa giảng viên.");
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 3: {
                    System.out.println("3.Sửa thông tin giảng viên.");
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 4: {
                    System.out.println("4.Tìm kiếm qua email.");
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 5: {
                    System.out.println("5.Export danh sách ra file.");
                    System.out.println("-----------------------------------------------");
                    break;
                }
                case 6: {
                    System.out.println("6.Import danh sách từ file.");
                    System.out.println("-----------------------------------------------");
                    break;

                }
                case 7: {
                    System.out.println("7.Thoát.");
                    cont = false;
                    break;
                }
            }
        } while (cont);
    }
}
