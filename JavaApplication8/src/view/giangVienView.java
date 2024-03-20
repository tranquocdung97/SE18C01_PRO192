
package view;


import java.util.List;
import model.giangVien;

public class giangVienView {
    public static void display(List<giangVien> danhSach){
        for(giangVien a : danhSach){
            System.out.println(a);
        }
    }

}


