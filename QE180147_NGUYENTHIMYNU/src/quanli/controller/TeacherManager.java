package quanli.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import quanli.model.Teacher;
import quanli.utils.Inputter;
import quanli.view.TeacherView;

public class TeacherManager {

    private final ArrayList<Teacher> list = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public TeacherManager() {
    }

    public void addTeacher(Teacher t) {
        t.setId(++Teacher.dem);
        list.add(t);
    }

    public void addTeacher(Teacher... thatList) {
        for (Teacher teacher : thatList) {
            teacher.setId(++Teacher.dem);
            this.list.add(teacher);
        }

    }
//them

    public void addTeacher() {
        Inputter t = new Inputter();
        t.input();

        t.getT().setId(++Teacher.dem);

        this.list.add(t.getT());
        System.out.println("them thanh cong");
        System.out.println("----------------------------------------");

    }
//xuat

    public void showAllTeachers() {
        TeacherView view = new TeacherView();
        view.displayList(list);
        System.out.println("xuat ra thanh cong");
        System.out.println("----------------------------------------");
    }
// xoa giang vien

    public void removeTeacher() {
        System.out.print("Nhap Id can xoa: ");
        int id = sc.nextInt();
        this.list.removeIf(s -> s.getId() == id);
        System.out.println("\nXoa giang vien thanh cong!");
        System.out.println("----------------------------------------");
    }
// cap nhat

    public void updateTeacher() {
        System.out.print("Nhap Id can cap nhat: ");
        int id = sc.nextInt();
        for (Teacher u : list) {
            if (u.getId() == id) {
                Inputter inp = new Inputter();
                inp.input();
                Teacher t = inp.getT();
                u.setFullname(t.getFullname());
                u.setHometown(t.getHometown());
                u.setBirthDate(t.getBirthDate());
                u.setGender(t.getGender());
                u.setGmail(t.getGmail());
                System.out.println("\n Cap nhat  thanh cong!");
                System.out.println("----------------------------------------");
            }
        }
    }
// tim kiem theo gmail

    public void findTeacher() {
        System.out.print("\nTim nguoi dung (ho ten/gioi tinh/ngay sinh/que quan/gmail):");
        sc.nextLine();
        String kw = sc.nextLine();
        ArrayList<Teacher> result = search(kw);
        if (result.isEmpty()) {
            System.out.println("Khong tim thay " + kw);
        } else {
            System.out.print("\nKet qua tim kiem theo tu khoa  " + kw + " la: ");
            for (Teacher teacher : result) {
                System.out.println(teacher.getFullname());
            }
        }
    }

    public ArrayList<Teacher> search(String kw) {
        return this.list.stream().filter(teacher -> teacher.getGmail().equals(kw)
                || teacher.getFullname().equals(kw) || teacher.getGender().equals(kw) || teacher.getHometown().equals(kw)).collect(Collectors.toCollection(ArrayList::new));
    }
// in ra thong tin 1 nguoi bat ki

    public void show1() {
        System.out.print("nhap id sinh vien can show");
        int id = sc.nextInt();
        boolean found = false;
        for (Teacher teacher : list) {
            if (teacher.getId() == id) {
                System.out.println("Thong tin giang vien:");
                System.out.println(teacher);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay giang vien co ID " + id);
        }
    }
// doc file

    public void ReadFile() throws FileNotFoundException, IOException {
        FileReader in = new FileReader("src/quanli/quanli.txt");
        Scanner scf = new Scanner(in);

        String name, hometown, gender, birthday, gmail;
        while (scf.hasNextLine()) {
            name = scf.nextLine();
            hometown = scf.nextLine();
            gender = scf.nextLine();
            birthday = scf.nextLine();
            gmail = scf.nextLine();
            Teacher t = new Teacher(name, hometown, gender, birthday, gmail);
            t.setId(++Teacher.dem);
            this.list.add(t);
        }
        in.close();
        System.out.println("\t\tDoc File thanh cong");
    }
//xuat file

    void ExportFile() throws IOException {
        FileWriter out = new FileWriter("src/quanli/quanli1.txt");
        for (Teacher teacher : list) {
            out.write("ID: " + teacher.getId() + "\n");
            out.write("Ho va ten: " + teacher.getFullname() + "\n");
            out.write(teacher.getGender() + "\n");
            out.write(teacher.getHometown() + "\n");
            out.write(teacher.getBirthDateS() + "\n");
            out.write(teacher.getGmail() + "\n");
        }
        out.close();
        System.out.println("\t\tXuat File thanh cong");
    }

    public void execute() throws IOException {
        int choice;
        do {
            System.out.println("1. Them giang vien");
            System.out.println("2. Xoa giang vien");
            System.out.println("3. Cap nhat giang vien");
            System.out.println("4. Xuat tat ca giang vien");
            System.out.println("5.Tim nguoi dung (ho ten/gioi tinh/ngay sinh/que quan/gmail)");
            System.out.println("6.in ra thong tin 1 nguoi bat ki");
            System.out.println("7.nhap danh sach  file");
            System.out.println("8.xuat danh sach ra file");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    addTeacher();
                }
                case 2 -> {
                    removeTeacher();
                }
                case 3 -> {
                    updateTeacher();
                }
                case 4 -> {
                    showAllTeachers();
                }
                case 5 -> {
                    findTeacher();
                }
                case 6 -> {
                    show1();
                }
                case 7 -> {
                    ReadFile();
                }
                case 8 -> {
                    ExportFile();
                }
            }
        } while (choice != 0);

    }

}
