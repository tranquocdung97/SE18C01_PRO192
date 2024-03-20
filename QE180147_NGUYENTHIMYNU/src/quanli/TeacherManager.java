package quanli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TeacherManager {

    private final ArrayList<Teacher> list = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public TeacherManager() {
    }

    public void addTeacher(Teacher t) {
        list.add(t);
    }

    public void addTeacher(Teacher... list) {
        this.list.addAll(Arrays.asList(list));
    }
//xuat

    public void showAllTeachers() {
//        for (giangvien item : list) {
//            item.display();
//        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }
// xoa giang vien

    public void removeTeacher(int id) {
        this.list.removeIf(s -> s.getId() == id);
    }
// cap nhat

    public void update(int id) {
        for (Teacher u : list) {
            if (u.getId() == id) {
                u.input();
            }
        }
    }

    public void Menu() {
        int choice;
        do {
            System.out.println("1. Them giang vien");
            System.out.println("2.Xoa giang vien");
            System.out.println("3.Cap nhat giang vien");
            System.out.println("4. Xuat tat ca giang vien");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    Teacher t = new Teacher();
                    t.input();
                    addTeacher(t);
                    System.out.println("them thanh cong");
                    System.out.println("----------------------------------------");
                    break;
                }
                case 2: {
                    System.out.println("Nhap Id can xoa");
                    int id = sc.nextInt();
                    removeTeacher(id);
                    System.out.println("\nXoa giang vien thanh cong!");
                    break;
                }
                case 3: {
                    System.out.println("Nhap Id can cap nhat");
                    int id = sc.nextInt();
                    update(id);
                    System.out.println("\n Cap nhat  thanh cong!");
                    System.out.println("----------------------------------------");
                    break;
                }
                case 4: {
                    showAllTeachers();
                    System.out.println("xuat ra thanh cong");
                    System.out.println("----------------------------------------");
                    break;
                }

            }
        } while (choice != 0);

    }

}
